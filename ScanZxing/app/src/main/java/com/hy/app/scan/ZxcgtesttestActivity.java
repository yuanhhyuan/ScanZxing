package com.hy.app.scan;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.hy.app.scan.R;


/**
 WebView加载第三方的网页，如百度等
 */
public class ZxcgtesttestActivity extends Activity {
    String TAG = "060_ZxcgtesttestActivity";
    WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxcgtest);
    }

}
