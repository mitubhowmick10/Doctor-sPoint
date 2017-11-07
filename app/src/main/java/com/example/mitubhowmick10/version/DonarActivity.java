package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.lang.String;

public class DonarActivity extends AppCompatActivity {
    private ImageButton bk;
    private EditText nam,pesha,age,weight,bldgrp,contact;
    private Button submit;
    DatabaseReference databaseDonar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar);
        nam =(EditText)findViewById(R.id.nameofdonar);
        pesha =(EditText)findViewById(R.id.occupationofdonar);
        age =(EditText)findViewById(R.id.ageofdonar);
        weight =(EditText)findViewById(R.id.weightofdonar);
        bldgrp=(EditText)findViewById(R.id.bldofdonar);
        contact=(EditText)findViewById(R.id.contactofdonar);
        submit=(Button)findViewById(R.id.submit);
        /////////////////////////submit button er kaj
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDonar();
            }
        });

        ///////////////
        //back_button er kaj
        bk=(ImageButton)findViewById(R.id.back_button);
        bk.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v)

            {
                Intent main = new Intent(DonarActivity.this, BloodBankActivity.class);

                startActivity(main);

                finish();
            }
        });
    }
    private void addDonar()
    {
        String name,occupation,vage,vweight,vbldgrp,vcontact;
        name=nam.getText().toString();
        occupation=pesha.getText().toString();
        vage=age.getText().toString();
        vweight=weight.getText().toString();
        vcontact=contact.getText().toString();
        vbldgrp=bldgrp.getText().toString();
        /////blood group thik korar kaj
        //incomplete
        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(occupation)
                && !TextUtils.isEmpty(vage) && !TextUtils.isEmpty(vcontact)
                && !TextUtils.isEmpty(vbldgrp))
        {
            databaseDonar = FirebaseDatabase.getInstance().getReference().child(vbldgrp);
            String id= databaseDonar.push().getKey();
            Donar donar=new Donar(name,occupation,vage,vweight,vcontact);
            databaseDonar.child(id).setValue(donar);
            Toast.makeText(this,"Welcome, You're added as a donar.",Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this,"You didn't fill all the fields!!!",Toast.LENGTH_SHORT).show();
        }

    }
}
