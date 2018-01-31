package com.lm.commonandroid2.lib_one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/lib_one/OneActivity")
public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }
}
