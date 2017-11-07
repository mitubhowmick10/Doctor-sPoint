package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class FeverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);
        Button causes = (Button) findViewById(R.id.fvrcauses);
        causes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(FeverActivity.this,fevCauses.class);
                startActivity(in);
            }
        });
        Button symptom =findViewById(R.id.fvrsymptom);
        symptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(FeverActivity.this,FeverSymtoms.class);
                startActivity(in2);
            }
        });
        Button back =(Button) findViewById(R.id. back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(FeverActivity.this,Main_Page.class);
                startActivity(in3);
            }
        });
    }
}