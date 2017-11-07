package com.example.mitubhowmick10.version.AnimFirstAid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mitubhowmick10.version.MenuPageActivity;
import com.example.mitubhowmick10.version.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.charset.MalformedInputException;

public class Main_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page);
        final Button fvr =(Button)findViewById(R.id.fvr);
        fvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main_Page.this,FeverActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button d2= (Button) findViewById(R.id.d2);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(Main_Page.this,AllergyAc.class);
                startActivity(in2);
                finish();
            }
        });
        Button d3 =(Button) findViewById(R.id.d3);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(Main_Page.this,AnemiaAc.class);
                startActivity(in3);
                finish();
            }
        });
        Button d4  = (Button)findViewById(R.id.d4);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4=new Intent(Main_Page.this, AsthmaAc.class);
                startActivity(in4);
                finish();
            }
        });
        Button d5 = (Button) findViewById(R.id.d5);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in5 = new Intent(Main_Page.this, AppendixAc.class);
                startActivity(in5);
                finish();
            }
        });
        Button d6 = (Button) findViewById(R.id.d6);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in6 = new Intent(Main_Page.this,BronchitisAc.class);
                startActivity(in6);
                finish();
            }
        });
        Button d7=(Button) findViewById(R.id.d7);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in7=new Intent(Main_Page.this,DiarrheaAc.class);
                startActivity(in7);
                finish();
            }
        });
        Button d8=(Button)findViewById(R.id.d8);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in8=new Intent(Main_Page.this,ChikungunyaAc.class);
                startActivity(in8);
                finish();
            }
        });
        Button d9= (Button)findViewById(R.id.d9);
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in9=new Intent(Main_Page.this,DengueAc.class);
                startActivity(in9);
                finish();
            }
        });
        Button d10=(Button)findViewById(R.id.d10);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in10=new Intent(Main_Page.this,CholeraAc.class);
                startActivity(in10);
                finish();
            }
        });
        Button d11=(Button)findViewById(R.id.d11);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in11=new Intent(Main_Page.this,TyphoidAc.class);
                startActivity(in11);
                finish();
            }
        });
        Button bk=(Button)findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(Main_Page.this, MenuPageActivity.class);
                startActivity(main);
                finish();
            }
        });
    }
}
