package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BloodBankActivity extends AppCompatActivity {

    private ImageButton bk;
    private Button donar;
    private Button aplus,aminus,bplus,bminus,abplus,abminus,oplus,ominus;
    private String flag="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_bank);


        ////////////Donate button er kaj complete
        donar=(Button)findViewById(R.id.donar);
        donar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BloodBankActivity.this,DonarActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ////////////////bld button gulor kaj
        aplus=(Button)findViewById(R.id.ap);
        aminus=(Button)findViewById(R.id.am);
        bplus=(Button)findViewById(R.id.bp);
        bminus=(Button)findViewById(R.id.bm);
        abplus=(Button)findViewById(R.id.abp);
        abminus=(Button)findViewById(R.id.abm);
        oplus=(Button)findViewById(R.id.op);
        ominus=(Button)findViewById(R.id.om);
        //A+ button flag ke one korbe
        aplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="1";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //A- button flag ke 2 korbe
        aminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="2";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //B+ Button flag ke three korbe
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="3";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //B- Button flag ke four korbe
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="4";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //AB+ Button flag ke five korbe
        abplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="5";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //AB- Button ke six korbe
        abminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="6";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //O+ Button ke seven korbe
        oplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="7";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });
        //O- Button flag ke eight korbe
        ominus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="8";
                Intent intent=new Intent(BloodBankActivity.this,BloodActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
                finish();
            }
        });



        ////////////////back button er kaj complete
        bk=(ImageButton)findViewById(R.id.back_button);

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Signinactivity=new Intent(BloodBankActivity.this,SignInActivity.class);
                startActivity(Signinactivity);
                finish();
            }
        });

    }
}
