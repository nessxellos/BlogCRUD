package com.com.blogCRUD.view.post;

import android.os.Bundle;

import com.com.blogCRUD.R;
import com.com.blogCRUD.view.CustomAppBarActivity;
import com.com.blogCRUD.view.InitActivity;


public class PostWriteActivity extends CustomAppBarActivity implements InitActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_write);

        init();
        initLr();
        initSetting();
    }

    @Override
    public void init() {

    }

    @Override
    public void initLr() {

    }

    @Override
    public void initSetting() {
        onAppBarSettings(true, "게시글 작성하기");
    }
}