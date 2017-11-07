package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class fevCauses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fev_causes);
        Button caues = (Button) findViewById(R.id.back);
        caues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(fevCauses.this,FeverActivity.class);
                startActivity(in);
            }
        });
    }

}
