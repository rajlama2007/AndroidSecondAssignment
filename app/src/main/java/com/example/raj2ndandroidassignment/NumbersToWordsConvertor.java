package com.example.raj2ndandroidassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumbersToWordsConvertor extends AppCompatActivity {
    EditText enternumber;
    Button change;
    GetterSetter getset =new GetterSetter();
    TextView result;
    private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty",
            " fifty", " sixty", " seventy", " eighty", " ninety" };

    private static final String[] numNames = { "", " one", " two", " three", " four", " five",
            " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen",
            " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_to_words_convertor);
        enternumber=findViewById(R.id.et_enternumber);
        change =findViewById(R.id.btn_change);
        result =findViewById(R.id.tv_resultnumbertowords);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getset.setEnternumber(enternumber.getText().toString());
            result.setText(convert(Integer.parseInt(getset.getEnternumber())));
            }
        });
    }


    private static String convert(int number)
    {
        String soFar;

        if (number % 100 < 20)
        {
            soFar = numNames[number % 100];
            number /= 100;
        } else
        {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0)
            return soFar;
        return numNames[number] + " hundred" + soFar;
    }
    }

