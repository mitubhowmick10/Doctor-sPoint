package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class BloodActivity extends AppCompatActivity {

    DatabaseReference databasedonar;
    List<Donar>donarList;
    ListView listViewDonars;
    ImageButton bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);
        String val=getIntent().getStringExtra("flag");
        int flag=Integer.parseInt(val);
        bk=(ImageButton)findViewById(R.id.back_button);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BloodActivity.this,BloodBankActivity.class);
                startActivity(intent);
                finish();
            }
        });
        donarList=new ArrayList<>();
        /////////////////
        if(flag==1) databasedonar = FirebaseDatabase.getInstance().getReference().child("A+");
        else if(flag==2)databasedonar =FirebaseDatabase.getInstance().getReference().child("A-");
        else if(flag==3)databasedonar =FirebaseDatabase.getInstance().getReference().child("B+");
        else if(flag==4)databasedonar =FirebaseDatabase.getInstance().getReference().child("B-");
        else if(flag==5)databasedonar =FirebaseDatabase.getInstance().getReference().child("AB+");
        else if(flag==6)databasedonar =FirebaseDatabase.getInstance().getReference().child("AB+");
        else if(flag==7)databasedonar =FirebaseDatabase.getInstance().getReference().child("O+");
        else if(flag==8)databasedonar =FirebaseDatabase.getInstance().getReference().child("O-");

        Log.e("Flag: ", val);

        listViewDonars=(ListView)findViewById(R.id.listviewdonar);

    }

    @Override
    protected void onStart() {
        super.onStart();
        databasedonar.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                donarList.clear();
              for(DataSnapshot donarsnapshot:dataSnapshot.getChildren())
              {
                  Donar donar=donarsnapshot.getValue(Donar.class);
                  donarList.add(donar);
              }
                DonarList adapter =new DonarList(BloodActivity.this,donarList);
                listViewDonars.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
               ///There is nothing to show
            }
        });

    }
}
