package com.melih.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2,editText3;
    private Button calculateButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);
        calculateButton = findViewById(R.id.button);
        resultTextView = findViewById(R.id.textView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();
                String text3 = editText3.getText().toString();


                double number1 = Double.parseDouble(text1);
                double number2 = Double.parseDouble(text2);
                double number3 = Double.parseDouble(text3);


                double average = (number1 + number2 + number3) / 3.0;


                resultTextView.setText("Ortalama: " + average);

                if (average >= 50) {
                    resultTextView.setText(resultTextView.getText() + "\nGeçtin (helal)");
                } else {
                    resultTextView.setText(resultTextView.getText() + "\nKaldın (nah geçersinnn ehe)");
                }
            }
        });
    }
}


