package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class AppendixAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appendix);
        Button bk = (Button) findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(AppendixAc.this,Main_Page.class);
                startActivity(in1);
            }
        });
        Button cau = (Button) findViewById(R.id.apc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(AppendixAc.this,AppendixC.class);
                startActivity(in2);
            }
        });
        Button sympt = (Button)findViewById(R.id.aps);
        sympt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3  = new Intent(AppendixAc.this,AppendixS.class);
                startActivity(in3);
            }
        });
    }

}