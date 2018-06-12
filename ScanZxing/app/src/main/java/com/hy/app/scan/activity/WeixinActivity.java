package com.hy.app.scan.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hy.app.scan.R;


public class WeixinActivity extends AppCompatActivity {

    Button mweixinsaoyisao1;
    Button mweixinsaoyisao2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weixin);



        initView();  //初始化view
        initListener();  //初始化多个监听事件
    }

    private void initView(){
        mweixinsaoyisao1 = (Button) findViewById(R.id.mweixinsaoyisao1);
        mweixinsaoyisao2 = (Button) findViewById(R.id.mweixinsaoyisao2);

    }

    private void initListener(){
        mweixinsaoyisao1.setOnClickListener(new MyListener());
        mweixinsaoyisao2.setOnClickListener(new MyListener());
    }
    private class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {  //同时监听多个事件
            switch (v.getId()) {
                case R.id.mweixinsaoyisao1:
                    f1();
                    break;
                case R.id.mweixinsaoyisao2:
                    f2();
                    break;
                default:
                    break;
            }
        }
    }

    public void f1() {
        WeixinUtils.getInstance().toWeChatScan(WeixinActivity.this);
    }

    public void f2() {
        WeixinUtils.getInstance().toWeChatScanDirect(WeixinActivity.this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();


    }

}
