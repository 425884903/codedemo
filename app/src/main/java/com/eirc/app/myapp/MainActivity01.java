package com.eirc.app.myapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity01 extends Activity implements OnClickListener {

    private Button shuai_btn=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //文件关联布局
        setContentView(R.layout.activity_main01);
       shuai_btn = (Button)findViewById(R.id.shuai_btn);
        shuai_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     if(v==shuai_btn){
         Toast.makeText(getApplicationContext(),"登录按钮",Toast.LENGTH_SHORT).show();
     }
    }
}