package com.yks.fontttf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Calligraphy的使用
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        //// TODO: 2017/6/26 在activity中的attachBaseContext方法中引用Calligraphy 
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
