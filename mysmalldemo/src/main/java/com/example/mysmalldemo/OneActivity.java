package com.example.mysmalldemo;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        final TextView myTime= (TextView) findViewById(R.id.myTime);
        //第一个参数是总时间 第二个参数是间隔时间
        CountDownTimer coun=new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                myTime.setText(millisUntilFinished/1000+"s");
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(OneActivity.this,MainActivity.class));
            }
        }.start();
    }
}
