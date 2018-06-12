package com.hy.app.scan.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/**
 * WeixinUtils class
 *
 * @author huangyuan
 * @data 2018/2/8
 */
public class WeixinUtils {

    private static final String TAG = "060_WeixinUtils";

    private WeixinUtils() {
    }
    public static WeixinUtils getInstance () {
        return SingletonHolder.instance;
    }
    private static class SingletonHolder {
        private static final WeixinUtils instance = new WeixinUtils();
    }


    /**
     * 微信扫一扫
     * http://blog.csdn.net/huolailaipianai/article/details/74909696
     * */
    public void toWeChatScan(Context context) {
        try {
            //利用Intent打开微信
            Uri uri = Uri.parse("weixin://");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            context.startActivity(intent);
        } catch (Exception e) {
            //若无法正常跳转，在此进行错误处理
            Toast.makeText(context, "无法跳转到微信，请检查您是否安装了微信！", Toast.LENGTH_SHORT).show();
        }
    }

    public  void toWeChatScanDirect(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
            intent.putExtra("LauncherUI.From.Scaner.Shortcut", true);
            intent.setFlags(335544320);
            intent.setAction("android.intent.action.VIEW");
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }


}

