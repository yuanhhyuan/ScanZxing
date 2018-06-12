package com.hy.app.scan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.hy.app.scan.activity.WeixinActivity;
import com.hy.app.scan.zxing.activity.CaptureActivity;

public class MainActivity extends Activity {
    private static final int CAMERA_RESULT = 0X33;

    Button mscan;
    Button mweixin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mscan = findViewById(R.id.mscan);
        mscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, CaptureActivity.class);
                startActivityForResult(intent,CAMERA_RESULT);
            }
        });

        mweixin = (Button) findViewById(R.id.mweixin);
        mweixin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,WeixinActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==CAMERA_RESULT&&resultCode==RESULT_OK){

            Intent intent = new Intent(MainActivity.this, ZxcgtesttestActivity.class);
            startActivity(intent);
        }
    }

}
