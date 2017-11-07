package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class AsthmaAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);
        Button bk = (Button) findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(AsthmaAc.this, Main_Page.class);
                startActivity(in);
            }
        });
        Button cau = (Button) findViewById(R.id.astc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(AsthmaAc.this,AsthmaC.class);
                startActivity(in2);
            }
        });
        Button symp = (Button) findViewById(R.id.asts);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(AsthmaAc.this,AsthmaS.class);
                startActivity(in3);
            }
        });
    }

}
