package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;
public class TyphoidS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoid_s);
        Button bak=(Button)findViewById(R.id.back);
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(TyphoidS.this,TyphoidAc.class);
                startActivity(in);
            }
        });
    }
}
