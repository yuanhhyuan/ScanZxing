package com.hy.app.scan.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hy.app.scan.R;


/**
 * Created by ZXCN1 on 2017/8/4.
 */

public class HeaderView extends RelativeLayout{

    private TextView leftTV;
//    private ImageView mLeftIV;
    private TextView titleTV;


//    private String mLeftText;
    private String titleText;
    private int textColor;

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public HeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.view_header,this,true);

        TypedArray a=context.obtainStyledAttributes(attrs, R.styleable.header);

        titleText = a.getString(R.styleable.header_titleText);
        textColor = a.getColor(R.styleable.header_textColor, Color.WHITE);

        a.recycle();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        leftTV = findViewById(R.id.leftTV);
        titleTV = findViewById(R.id.titleTV);

        if (!TextUtils.isEmpty(titleText)) {
            titleTV.setText(titleText);
        }
        titleTV.setTextColor(textColor);
        leftTV.setTextColor(textColor);
    }



    public void setTitle(int resID) {
        titleTV.setText(resID);
    }

    public void setTitle(String title) {
        titleTV.setText(title);
    }

}
