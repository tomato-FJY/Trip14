package com.example.travel;

import android.app.Application;
import android.content.Context;

/**
 *
 * 获取全局上下文
 */
public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    // 调用
    public static Context getContext() {
        return context;
    }

}
