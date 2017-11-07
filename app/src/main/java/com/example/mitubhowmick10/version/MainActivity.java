package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button con=(Button)findViewById(R.id.contin);
        Button exit=(Button)findViewById(R.id.exit);
        con.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent mnu = new Intent(MainActivity.this, MenuPageActivity.class);

                startActivity(mnu);

                finish();


            }
        });



        exit.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                finish();
                System.exit(0);//finish ar exit age pore dea niye kono samossa ache kina?
            }
        });

    }
}
