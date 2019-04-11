package com.example.raj2ndandroidassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bmicalculation extends AppCompatActivity {
    EditText height,weight;
    Button compute;
    Double answer;
    TextView result;

    GetterSetter getset= new GetterSetter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculation);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        compute=findViewById(R.id.computebmi);
        result=findViewById(R.id.txtresult);

      compute.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            getset.setHeight(height.getText().toString());
            getset.setWeight(weight.getText().toString());

            Double heightt=Double.parseDouble(getset.getHeight());
            Double weightt=Double.parseDouble(getset.getWeight());

            Double a=heightt;
            Double b=weightt;

            answer=b/((a*a)/10000); //logic for calculating Body Mass Index
            result.setText(answer.toString());

            switch (v.getId()){
                case R.id.computebmi:
                    if(answer<18.5)
                    {
                        Toast.makeText(Bmicalculation.this, "BMI Category : Underweight", Toast.LENGTH_SHORT).show();
                    }
                    else if(answer>18.5 && answer<=24.9)
                    {
                        Toast.makeText(Bmicalculation.this, "BMI Category : Normal Weight", Toast.LENGTH_SHORT).show();
                    }
                    else if(answer>=25 && answer<=29.9)
                    {
                    Toast.makeText(Bmicalculation.this, "BMI Category : Over Weight", Toast.LENGTH_SHORT).show();
                    }
                    else if(answer>=30)
                    {
                        Toast.makeText(Bmicalculation.this, "BMI Category : Obesity", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
          }
      });
    }
}
