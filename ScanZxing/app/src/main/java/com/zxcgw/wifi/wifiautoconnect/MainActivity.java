package com.zxcgw.wifi.wifiautoconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.zxcgw.wifi.wifiautoconnect.zxing.activity.CaptureActivity;

/**
 * 主页面
 *
 * @author xtich
 * @date 2018/1/16
 */

public class MainActivity extends Activity {
    private static final int CAMERA_RESULT = 0X33;

    Button mscan;

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
