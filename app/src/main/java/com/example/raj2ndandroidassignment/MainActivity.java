package com.example.raj2ndandroidassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
Button bmi,ntw,tax,vehicle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmi=findViewById(R.id.bmiclaculator);
        ntw=findViewById(R.id.numberswordsconvertor);
        tax=findViewById(R.id.taxcalculator);
        vehicle=findViewById(R.id.vehicleapp);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Bmicalculation.class);
                startActivity(intent);
            }
        });

        ntw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NumbersToWordsConvertor.class);
                startActivity(intent);
            }
        });

        tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Taxcalulator.class);
                startActivity(intent);
            }
        });
        vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,VehicleForm.class);
                startActivity(intent);
            }
        });

    }
}
