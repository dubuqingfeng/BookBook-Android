package com.hookheart.bookbook.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hookheart.bookbook.R;
import com.hookheart.bookbook.adapter.BookAdapter;
import com.hookheart.bookbook.entity.BookMessage;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by dubuqingfeng on 16/12/14.
 */
public class MyBooksFragment extends Fragment{
    private static final String TAG = "MyBooksFragment";
    private View mView;
    private BookAdapter mBookAdapter;
    private List<BookMessage> data = new ArrayList<BookMessage>();
    private ListView mListView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_my_books, null);
        findViewsById();

        return mView;
    }

    private void findViewsById() {
        mListView = (ListView) mView.findViewById(R.id.mListView);
        mListView.setAdapter(mBookAdapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
    }

    private void initData() {
        mBookAdapter = new BookAdapter(this.getActivity(), data);
        mListView.setAdapter(mBookAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.e("tag", "clickPosition" + position);
            }
        });
        List<BookMessage> datahandler = new ArrayList<BookMessage>();

        for(int i = 10; i <= 20; i++){
            BookMessage msg = new BookMessage();
            msg.setAuthor("zuozhe");
            msg.setClassify("fenlei");
            msg.setTime("10tianqian");
            msg.setTitle("thhu");
            msg.setSummary("fuck");
            datahandler.add(msg);
        }

        Message msg = mHandler.obtainMessage(11, datahandler);
        mHandler.sendMessage(msg);
    }

    private Handler mHandler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch(msg.what){
                case 11:
                    if(mBookAdapter != null){
                        mBookAdapter.data.addAll((ArrayList<BookMessage>) msg.obj);
                        mBookAdapter.notifyDataSetChanged();
                    }
                    break;
            }
        }

    };
}