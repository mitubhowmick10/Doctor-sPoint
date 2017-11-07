package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mitubhowmick10.version.AnimFirstAid.Main_Page;

public class MenuPageActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);//main page ese kichukkhn wait kore menu page a cole jabe

        setContentView(R.layout.activity_menu_page);

        String str;

        Button bmi=(Button)findViewById(R.id.BMI_Calculation);
        Button abs=(Button)findViewById(R.id.About_Us);
        ImageButton bk=(ImageButton)findViewById(R.id.back_button);
        Button firstaid=(Button)findViewById(R.id.first_aid);
        Button embld=(Button)findViewById(R.id.Imergency_blood);
        Button google_maps=findViewById(R.id.Nearest_Hospital_Location);

        //google_maps er kaj
        google_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gmaps=new Intent(MenuPageActivity.this, MapsActivity.class);
                startActivity(gmaps);
                finish();
            }
        });


        //bmi_calculation er kaj
        bmi.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent bmi = new Intent(MenuPageActivity.this, BmiCalculatorActivity.class);

                startActivity(bmi);

                finish();

            }
        });
        //help button er kaj
        Button hlp=(Button)findViewById(R.id.help);
        hlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hl=new Intent(MenuPageActivity.this,HelpPage.class);
                startActivity(hl);
                finish();
            }
        });


        //about_us button er kaj
        abs.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent abs = new Intent(MenuPageActivity.this, AboutUsActivity.class);

                startActivity(abs);

                finish();


            }
        });


        //Imergency_blood button er kaj
        embld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signinactivity = new Intent(MenuPageActivity.this, SignInActivity.class);
                startActivity(signinactivity);
                finish();

            }
        });
        //first aid button er kaj
        firstaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fd=new Intent(MenuPageActivity.this, Main_Page.class);
                startActivity(fd);
                finish();
            }
        });
        //review button er under a map er kaj check
        Button rev=(Button)findViewById(R.id.Review);
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map=new Intent(MenuPageActivity.this,MapsActivity.class);
                startActivity(map);
                finish();
            }
        });

        //back_button er kaj
        bk.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v)

            {
                Intent main = new Intent(MenuPageActivity.this, MainActivity.class);

                startActivity(main);

                finish();
            }
        });

        //this.finish();
    }
}
