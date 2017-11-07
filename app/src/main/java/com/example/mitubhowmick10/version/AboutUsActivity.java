package com.example.mitubhowmick10.version;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        ImageButton bk=(ImageButton)findViewById(R.id.back_button);
        bk.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v)

            {
                Intent main = new Intent(AboutUsActivity.this, MenuPageActivity.class);

                startActivity(main);

                finish();
            }
        });

    }
}
