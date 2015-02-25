package com.hookheart.bookbook.ui;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hookheart.bookbook.bean.Book;

public class CameraActivity extends Activity {
	private Button mCaptureButton, mExzitButton;
	private TextView mResultTextView;
	private ImageView mResultImageView;
	private Book book;
	private String mStringBookInfo;
	private static final String DOUBAN_API = "http://api.douban.com/book/subject/isbn/";

	public static String RESULT_MESSAGE = null;
	public static Bitmap RESULT_BITMAP = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);

		init();
	}

	private void init() {
		mCaptureButton = (Button) findViewById(R.id.bt_capture);
		mExzitButton = (Button) findViewById(R.id.bt_exit);
		mResultTextView = (TextView) findViewById(R.id.tv_result);
		mResultImageView = (ImageView) findViewById(R.id.iv_result);

		mCaptureButton.setOnClickListener(listener);
		mExzitButton.setOnClickListener(listener);
	}

	private View.OnClickListener listener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.bt_capture:

				Intent intent = new Intent(
						com.hookheart.bookbook.ui.CameraActivity.this,
						CaptureActivity.class);
				com.digdream.tasbook.ui.CameraActivity.this
						.startActivity(intent);
				break;

			case R.id.bt_exit:

				com.digdream.tasbook.ui.CameraActivity.this.finish();
				break;

			default:
				break;
			}
		}
	};

	@Override
	protected void onResume() {
		super.onResume();

		if (RESULT_MESSAGE != null && RESULT_BITMAP != null) {
			// mResultTextView.setText(RESULT_MESSAGE);
			new Thread() {
				@Override
				public void run() {
					super.run();
					DefaultHttpClient client = new DefaultHttpClient();
					String isbn = RESULT_MESSAGE;
					HttpGet request = new HttpGet(DOUBAN_API + isbn);
					try {
						HttpResponse response = client.execute(request);
						book = IsbnXmlSax
								.sax(response.getEntity().getContent());
						String summary = book.getSummary();
						summary = summary.substring(0,
								summary.length() < 60 ? summary.length() : 60)
								.concat("...");
						String string = String.format(mStringBookInfo,
								book.getName(), book.getAuthor(),
								book.getPublisher(), book.getIsbn13(), summary);
						updateBookInfoView(string);
					} catch (Exception e) {
						e.printStackTrace();
					}
					mResultImageView.setImageBitmap(RESULT_BITMAP);

					RESULT_MESSAGE = null;
					RESULT_BITMAP = null;
					handler.sendEmptyMessage(0);
				}
			}.start();

		}
	}
	@SuppressLint("HandlerLeak")
	private Handler handler = new Handler() {

		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 0:
				break;
			}
		};
	};

	/**
	 * ����ͼ����Ϣ
	 * 
	 * @param string
	 */
	private void updateBookInfoView(final String string) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				mResultTextView.setText(string);
			}
		});
	}
}
