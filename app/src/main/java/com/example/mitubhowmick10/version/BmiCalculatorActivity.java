package com.example.mitubhowmick10.version;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class BmiCalculatorActivity extends AppCompatActivity {

    private  Double weight=0.0,height=0.0;

    private EditText editweight,editheight;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bmi_calculator);

        editweight=(EditText)findViewById(R.id.editweight);

        editheight=(EditText)findViewById(R.id.editheight);

        Button submit=(Button)findViewById(R.id.submit) ;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weight = Double.parseDouble(editweight.getText().toString());

                height = Double.parseDouble(editheight.getText().toString());

                Double result=weight/(height*height);

                String analysis= "";

                if(result<18.5)analysis="UNDERWEIGHT";

                else if(result<25)analysis="NORMAL WEIGHT";

                else if(result<30)analysis="OVERWEIGHT";

                else if(result>=30)analysis="OBESITY";

                TextView bmiresult=(TextView)findViewById(R.id.bmiresult);

                bmiresult.setText(Double.toString(result));

                TextView bmianalysis=(TextView)findViewById(R.id.bmianalysis);

                bmianalysis.setText(analysis);
            }
        });

        ImageButton bk=(ImageButton)findViewById(R.id.back_button);

        bk.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v)

            {

                Intent main = new Intent(BmiCalculatorActivity.this, MenuPageActivity.class);

                startActivity(main);

                finish();

            }
        });

    }
}

