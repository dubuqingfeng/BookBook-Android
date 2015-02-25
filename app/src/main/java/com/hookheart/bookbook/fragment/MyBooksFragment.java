package com.hookheart.bookbook.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hookheart.bookbook.adapter.BookAdapter;

import book.hookheart.com.com.R;

/**
 * Created by dubuqingfeng on 16/12/14.
 */
public class MyBooksFragment extends Fragment{
    private static final String TAG = "MyBooksFragment";
    private View mView;
    private BookAdapter mBookAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_my_books, null);
        findViewsById();

        return mView;
    }

    private void findViewsById() {

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
    }

    private void initData() {
    }
}