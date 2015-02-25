package com.hookheart.bookbook.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return null;
    }
}
