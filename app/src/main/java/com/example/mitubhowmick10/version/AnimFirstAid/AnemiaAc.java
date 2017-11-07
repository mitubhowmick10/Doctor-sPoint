package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class AnemiaAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anemia);
        Button bk = (Button)  findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 =new Intent(AnemiaAc.this,Main_Page.class);
                startActivity(in1);
            }
        });

        Button cus=(Button) findViewById(R.id.anmc);
        cus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(AnemiaAc.this,AnemiaC.class);
                startActivity(in2);
            }
        });

        Button symp = (Button) findViewById(R.id.anms);
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(AnemiaAc.this,AnemiaS.class);
                startActivity(in3);

            }
        });

    }

}