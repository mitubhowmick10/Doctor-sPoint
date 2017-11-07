package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class DengueAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dengue);
        Button bk=(Button)findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1=new Intent(DengueAc.this,Main_Page.class);
                startActivity(in1);
            }
        });
        Button symp=(Button) findViewById(R.id.dens);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(DengueAc.this,DengueS.class);
                startActivity(in2);
            }
        });
        Button cau=(Button)findViewById(R.id.denc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(DengueAc.this,DengueC.class);
                startActivity(in3);
            }
        });
    }
}
