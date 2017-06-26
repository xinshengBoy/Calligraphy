package com.yks.fontttf;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Calligraphy的初始化设置
 * calligraphy自定义字体
 * 参考网址：https://github.com/chrisjenx/Calligraphy
 * Created by admin on 2017/6/26.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
            .setDefaultFontPath("fonts/qiaoqiao.ttf")
            .setFontAttrId(R.attr.fontPath)
            .build());
    }
}
