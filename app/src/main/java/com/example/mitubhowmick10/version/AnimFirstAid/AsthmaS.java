package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;
public class AsthmaS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma_s);
        Button bka  =(Button) findViewById(R.id.back);
        bka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(AsthmaS.this,AsthmaAc.class);
                startActivity(in);
            }
        });
    }
}
