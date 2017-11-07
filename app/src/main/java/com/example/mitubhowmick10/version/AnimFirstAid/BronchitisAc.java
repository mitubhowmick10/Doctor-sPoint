package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class BronchitisAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronchitis);
        Button bk = (Button) findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(BronchitisAc.this,Main_Page.class);
                startActivity(in1);
            }
        });
        Button symp = (Button) findViewById(R.id.brns);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(BronchitisAc.this,BronchitisS.class);
                startActivity(in2);
            }
        });
        Button cau = (Button) findViewById(R.id.brnc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(BronchitisAc.this,BronchitisC.class);
                startActivity(in3);
            }
        });

    }
}
