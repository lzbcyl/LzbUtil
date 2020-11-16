package com.lzb.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lzb.lzbutils.http.HttpUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testHttp();
    }

    // HttpUtils 用法
    private void testHttp() {
        //记得初始化
        HttpUtils.getInstance().init(this);

        HttpUtils.subscribe(HttpUtils.create(HttpApi.class, "http://192.168.8.148:9002").findList(), s -> {
            Log.e("Tag", s.getMessage()+s.getData());
        }, e -> {
            Log.e("Tag", e.getMessage());
        });
    }
}