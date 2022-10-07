package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText gNum;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gNum = findViewById(R.id.gNum);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = gNum.getText().toString();
                if (value.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Debes ingresa un numero", Toast.LENGTH_SHORT).show();
                } else {
                    int numero = Integer.parseInt(value);
                    if (numero <= 0) {
                        Toast.makeText(getApplicationContext(), "Ingresa un numero mayor que cero", Toast.LENGTH_SHORT).show();
                    } else if (numero > 32000) {
                        Toast.makeText(getApplicationContext(), "Ingresa un numero menor a 32,000", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Ingresaste el numero: " + numero, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}