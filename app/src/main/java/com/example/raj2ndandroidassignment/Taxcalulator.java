package com.example.raj2ndandroidassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Taxcalulator extends AppCompatActivity {
EditText salary;
Button calculator;
GetterSetter getset=new GetterSetter();
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxcalulator);

        salary=findViewById(R.id.et_salary);
        result=findViewById(R.id.tv_result);
        calculator=findViewById(R.id.btn_ok);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getset.setSalary(salary.getText().toString());
                Double salary=Double.parseDouble(getset.getSalary());
                Double valuestore=salary*12;
                switch (v.getId())
                {
                    case R.id.btn_ok:
                        if(valuestore>=1 && valuestore<200000)
                        {
                            Double tax = (valuestore/100);
                            result.setText("Tax amount is RS" + tax.toString());
                        }
                        else if(valuestore>=200000 && valuestore<350000)
                        {
                           Double tax=(valuestore/100);
                           result.setText("Tax amount is RS"+tax.toString());
                        }
                        else if (valuestore>=350000)
                        {
                            Double tax= 2000 + 22500 +((valuestore - 350000)*0.25);
                            result.setText("Tax amount is RS" + tax.toString());
                        }
                        break;
                }
            }
        });
    }
}
