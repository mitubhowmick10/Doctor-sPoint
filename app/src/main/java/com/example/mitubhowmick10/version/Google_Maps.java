package com.example.mitubhowmick10.version;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class Google_Maps extends AppCompatActivity {
    private static final String TAG ="GOOGLE_MAPS";
    private static final int ERROR_DIALOG_REQUEST=9001;
    private ImageButton bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google__maps);

        //Back Button er kaj complete here
        bk=(ImageButton)findViewById(R.id.back_button);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu=new Intent(Google_Maps.this,MenuPageActivity.class);
                startActivity(menu);
                finish();
            }
        });

        //Akhane map a dhokar kaj korbo
        if(isServicesOk())
        {
            init();
        }
    }
    private void init()
    {
        Button btnmap=(Button)findViewById(R.id.button_map);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Google_Maps.this,MapActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    //Service ok kina check korar jnne
    public boolean isServicesOk()
    {
        Log.d(TAG,"Checking google services version ");
        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(Google_Maps.this);
        if(available == ConnectionResult.SUCCESS)
        {
            Log.d(TAG,"Everything is working");
            return true;
        }
        else if(GoogleApiAvailability.getInstance().isUserResolvableError(available)){
            Log.d(TAG,"AN Error But resolvable");
            Dialog dialog=GoogleApiAvailability.getInstance().getErrorDialog(Google_Maps.this,available,ERROR_DIALOG_REQUEST);
            dialog.show();
        }
        else {
            Toast.makeText(this,"You can't make map request",Toast.LENGTH_SHORT).show();

        }
        return false;
    }
}
