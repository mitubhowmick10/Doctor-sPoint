package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class CholeraAc extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholera);
        Button symp=(Button) findViewById(R.id.chos);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(CholeraAc.this,CholeraS.class);
                startActivity(in1);
            }
        });
        Button cau=(Button) findViewById(R.id.choc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(CholeraAc.this,CholeraC.class);
                startActivity(in2);
            }
        });
        Button bk=(Button)findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(CholeraAc.this,Main_Page.class);
                startActivity(in3);
            }
        });
    }
}
