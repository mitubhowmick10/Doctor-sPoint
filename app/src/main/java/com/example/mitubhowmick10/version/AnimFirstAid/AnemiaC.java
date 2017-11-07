package com.example.mitubhowmick10.version.AnimFirstAid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mitubhowmick10.version.R;

public class AnemiaC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anemia_c);

        Button bkl = (Button) findViewById(R.id.back);
        bkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(AnemiaC.this,AnemiaAc.class);
                startActivity(in);
            }
        });
    }

}
