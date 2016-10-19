package com.eirc.app.myapp;


import android.app.Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    //  private TextView text_iv = null;
    private Button cao_btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //文件关联布局
        setContentView(R.layout.activity_main);
        cao_btn = (Button)findViewById(R.id.cao_btn);

        cao_btn.setOnClickListener(listener);
        //调用IDtext——tv 里面的文字
        // text_iv = (TextView)findViewById(R.id.text_iv);
        //修改名字
        //text_btn.setText("潘先生你好");
        //Toast.makeText(this,text_tv.getText().toString(),Toast.LENGTH_SHORT).show();
        //吐司 显示
        // Toast.makeText(this,"张鹏飞  嘿嘿嘿",Toast.LENGTH_SHORT).show();
        // cao_btn= (Button)findViewById(R.id.cao_btn);
        //cao_btn.setOnClickListener(this);
    }
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "第二次，嘿嘿嘿", Toast.LENGTH_SHORT).show();
            }
        };

    //实现接口法
//    @Override
//    public void onClick(View v) {
//
//        if(v == cao_btn){
//            Toast.makeText(getApplicationContext(),"  第三次，嘿嘿嘿",Toast.LENGTH_SHORT).show();
//        }
//    }

//     public void play(View v){
//         Toast.makeText(getApplicationContext(),text_btn.getText().toString(), Toast.LENGTH_SHORT).show();
//     }



}