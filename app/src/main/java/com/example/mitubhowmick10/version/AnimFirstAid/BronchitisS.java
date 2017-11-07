package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;


public class BronchitisS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronchitis_s);
        Button back2= (Button)findViewById(R.id.back);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(BronchitisS.this,BronchitisAc.class);
                startActivity(in);
            }
        });
    }
}
