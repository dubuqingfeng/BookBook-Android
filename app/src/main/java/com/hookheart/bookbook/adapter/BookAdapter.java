package com.hookheart.bookbook.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hookheart.bookbook.R;
import com.hookheart.bookbook.entity.BookMessage;

import java.util.List;

/**
 * Created by dubuqingfeng on 2/25/15.
 */
public class BookAdapter extends BaseAdapter {
    private Context mContext = null;
    public List<BookMessage> data;
    public BookAdapter() {
    }

    public BookAdapter(Context ctx, List<BookMessage> data){
        this.data = data;
        this.mContext = ctx;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.item_book, parent, false);
            holder = new ViewHolder();
            holder.booklist = (RelativeLayout) convertView
                    .findViewById(R.id.booklist);

            //holder.iv_bookimage = (ImageView) convertView
             //       .findViewById(R.id.iv_bookimage);
            holder.iv_head_icon = (ImageView) convertView
                    .findViewById(R.id.iv_head_icon);

            holder.tv_book_share_time = (TextView) convertView
                    .findViewById(R.id.tv_book_share_time);
            holder.tv_share_author = (TextView) convertView
                    .findViewById(R.id.tv_share_author);
            holder.tv_book_summary = (TextView) convertView
                    .findViewById(R.id.tv_book_summary);
            holder.tv_book_title = (TextView) convertView
                    .findViewById(R.id.tv_book_title);
            holder.tv_book_tag = (TextView) convertView
                    .findViewById(R.id.tv_book_tag);
            holder.tv_book_replies = (TextView) convertView.findViewById(R.id.tv_book_replies);


            convertView.setTag(holder);
        } else {// 有直接获得ViewHolder
            holder = (ViewHolder) convertView.getTag();
        }

        Log.i("SharebookAdapter", "getView position=" + position);

        BookMessage msg = data.get(position);

        holder.tv_book_title.setText(msg.getTitle());
        holder.tv_book_summary.setText(msg.getSummary());
        holder.tv_book_share_time.setText(msg.getTime());
        holder.tv_book_tag.setText(msg.getClassify());
        holder.tv_share_author.setText(msg.getAuthor());
        holder.iv_head_icon.setImageResource(R.drawable.username_icon);
        // holder.iv_icon.setImageResource(msg.getIcon_id());

        final ListView mListView = (ListView) convertView
                .findViewById(R.id.mListView);
        // 这句代码的作用是为了解决convertView被重用的时候，图片预设的问题
       // holder.iv_bookimage.setImageResource(R.drawable.qq_icon);

        return convertView;
    }

    static class ViewHolder {
        RelativeLayout booklist;
        TextView tv_book_share_time;
        TextView tv_share_author;
        TextView tv_book_summary;
        TextView tv_book_title;
        TextView tv_book_tag;
        TextView tv_book_replies;

        ImageView iv_bookimage;
        ImageView iv_head_icon;

    }

    /**
     * 单击事件监听器
     */
    private onRightItemClickListener mListener = null;

    public void setOnRightItemClickListener(onRightItemClickListener listener) {
        mListener = listener;
    }

    public interface onRightItemClickListener {
        void onRightItemClick(View v, int position);
    }
}
