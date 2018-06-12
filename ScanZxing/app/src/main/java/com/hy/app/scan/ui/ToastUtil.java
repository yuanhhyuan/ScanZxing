package com.hy.app.scan.ui;

import android.content.Context;
import android.widget.Toast;


public class ToastUtil {

    public static Toast mToast;

    public static void showToast(Context context, String toastText, int duration) {
        if (mToast != null) {
            mToast.setText(toastText);
            mToast.setDuration(duration);
            mToast.show();
        }
        else {
            mToast = Toast.makeText(context, toastText, duration);
            mToast.show();
        }
    }

    public static void showToast(String str){
        Toast.makeText(mApplication.getContext(),str,Toast.LENGTH_SHORT).show();
    }
    public static void cancleToast(){
        if(mToast!=null) {
            mToast.cancel();
        }
    }
}
