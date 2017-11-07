package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class AllergyAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy);
        Button  sym = (Button) findViewById(R.id.lrgs);
        sym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 =new Intent(AllergyAc.this,AllergyS.class);
                startActivity(in1);
            }
        });
        Button bk= (Button) findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(AllergyAc.this,Main_Page.class);
                startActivity(in2);
            }
        });
        Button cau = (Button) findViewById(R.id.lrgc);
        cau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(AllergyAc.this, AllergyC.class);
                startActivity(in3);
            }
        });

    }

}
