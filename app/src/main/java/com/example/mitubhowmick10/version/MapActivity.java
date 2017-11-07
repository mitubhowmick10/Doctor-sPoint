package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class MapActivity extends AppCompatActivity  implements OnMapReadyCallback{
    @Override
    public void onMapReady(GoogleMap googleMap) {
        Toast.makeText(this,"Map is Ready",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onMapReady: map is ready here");
        gMap=googleMap;
    }
    private static final String FINE_LOCATION= android.Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COARSE_LOCATION= android.Manifest.permission.ACCESS_COARSE_LOCATION;
//vars
    private Boolean mLocationPermissionGranted =false;
    private static final int LOCATION_PERMISSOIN_REQUEST_CODE =1234;
    private static final String TAG="MapActivity";
    private GoogleMap gMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        getLocationPermission();
    }
 //////////////////////////   /////////////////
    private void intmap()
    {
        Log.d(TAG,"Initialize map");
        final SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(MapActivity.this);
    }
///////////////////////////////////
    private void getLocationPermission()
    {
        Log.d(TAG,"getLocationPermission: getting Location Permission ");
        String[] permissions= {android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.ACCESS_COARSE_LOCATION};

        if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                FINE_LOCATION)== PackageManager.PERMISSION_GRANTED)
        {
            if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                     COARSE_LOCATION )== PackageManager.PERMISSION_GRANTED)
            {
                mLocationPermissionGranted=true;
                intmap();
            }
            else
            {
                ActivityCompat.requestPermissions(this,
                        permissions,
                        LOCATION_PERMISSOIN_REQUEST_CODE);
            }
        } else {
            ActivityCompat.requestPermissions(this,
                    permissions,
                    LOCATION_PERMISSOIN_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Log.d(TAG,"onRequestPermissionsResult: Called");
        mLocationPermissionGranted=false;
        switch (requestCode)
        {
            case LOCATION_PERMISSOIN_REQUEST_CODE:
            {
                if(grantResults.length>0)
                {
                    for(int i=0;i<grantResults.length;i++)
                    {
                        if(grantResults[i]!=PackageManager.PERMISSION_GRANTED)
                        {
                            Log.d(TAG,"onRequestPermissionsResult: Permission failed.");
                            mLocationPermissionGranted=false;
                            return;
                        }
                    }
                    Log.d(TAG,"onRequestPermissionsResult: Permission Granted.");
                    mLocationPermissionGranted=true;
                    //initialize our map
                    intmap();
                }
            }
        }
    }

}
