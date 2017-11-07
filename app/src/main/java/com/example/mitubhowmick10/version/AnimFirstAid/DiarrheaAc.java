package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class DiarrheaAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diarrhea);
        Button symp= (Button)findViewById(R.id.dias);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(DiarrheaAc.this,DiarrheaS.class);
                startActivity(in1);
            }
        });
        Button cau=(Button)findViewById(R.id.diac);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(DiarrheaAc.this,DiarrheaC.class);
                startActivity(in2);
            }
        });
        Button bkl=(Button) findViewById(R.id.back);
        bkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(DiarrheaAc.this,Main_Page.class);
                startActivity(in3);
            }
        });
    }
}
