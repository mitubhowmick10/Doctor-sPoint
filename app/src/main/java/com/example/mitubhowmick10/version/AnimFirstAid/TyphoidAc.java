package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class TyphoidAc extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoid);
        Button symp=(Button) findViewById(R.id.typs);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(TyphoidAc.this,TyphoidS.class);
                startActivity(in1);
            }
        });
        Button cau=(Button)findViewById(R.id.typc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(TyphoidAc.this,TyphoidC.class);
                startActivity(in2);
            }
        });
        Button bak=(Button)findViewById(R.id.back);
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(TyphoidAc.this,Main_Page.class);
                startActivity(in3);
            }
        });
    }
}
