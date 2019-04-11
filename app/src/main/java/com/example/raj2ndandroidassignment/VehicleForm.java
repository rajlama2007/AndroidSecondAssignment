package com.example.raj2ndandroidassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VehicleForm extends AppCompatActivity {
    EditText make, year, color, purchase, engine;
    Button createcar,creatediesel;
    TextView result;
    GetterSetter getset=new GetterSetter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_form);

        make=findViewById(R.id.et_make);
        year = findViewById(R.id.et_year);
        color = findViewById(R.id.et_color);
        purchase = findViewById(R.id.et_purchase);
        engine = findViewById(R.id.et_engine);
        createcar = findViewById(R.id.btn_createcar);
        creatediesel = findViewById(R.id.btn_creatediesel);
        result = findViewById(R.id.tv_resultdisplay);

        createcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getset.setMake(make.getText().toString());
                getset.setColor(color.getText().toString());
                getset.setYear(year.getText().toString());
                getset.setPurchase(purchase.getText().toString());
                getset.setEngine(engine.getText().toString());
                String values = "\r\n" +
                        "\r\n" + result.getText() +
                        "\r\n" +" The Vechile is Manufacture by "+ getset.getMake() +
                        "\r\n" + " Made Year: "+ getset.getColor() +
                        "\r\n" + "Car color: " + getset.getYear() +
                        "\r\n" +  "Current value: "+ getset.getPurchase() +
                        "\r\n" + "Engine per liter: " + getset.getEngine() +
                        "\r\n";

                result.setText(values);
            }
        });
    }
}
