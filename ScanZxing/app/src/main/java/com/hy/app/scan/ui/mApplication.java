package com.hy.app.scan.ui;

import android.app.Application;
import android.content.Context;

/**
 * Created by xtich on 2018/1/15.
 */

public class mApplication extends Application {
    public static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
    public static Context getContext() {
        return mContext;
    }
}
