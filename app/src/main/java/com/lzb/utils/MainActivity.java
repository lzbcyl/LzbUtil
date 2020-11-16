package com.lzb.utils;

import android.util.Log;

import com.lzb.lzbutils.base.BaseLoadActivity;
import com.lzb.lzbutils.http.HttpUtils;
import com.lzb.utils.databinding.ActivityMainBinding;
import com.lzb.utils.http.HttpApi;
import com.lzb.utils.viewmodel.MainViewModel;

public class MainActivity extends BaseLoadActivity<MainViewModel, ActivityMainBinding> {



    @Override
    public int initView() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {

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