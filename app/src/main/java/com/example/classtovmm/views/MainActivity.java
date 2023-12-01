package com.example.classtovmm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.classtovmm.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNum1, editTextNum2;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void sumar(View view) {
        // Obtener los valores de los EditText
        String strNum1 = editTextNum1.getText().toString();
        String strNum2 = editTextNum2.getText().toString();

        // Verificar que se ingresaron números
        if (!strNum1.isEmpty() && !strNum2.isEmpty()) {
            // Convertir los valores a números
            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);

            // Realizar la suma
            double resultado = num1 + num2;

            // Mostrar el resultado en el TextView
            textViewResultado.setText("Resultado: " + resultado);
        } else {
            // Manejar el caso en que no se ingresaron números
            textViewResultado.setText("Ingrese números en ambos campos");
        }
    }
}
