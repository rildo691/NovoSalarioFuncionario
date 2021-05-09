package com.example.novosalariofuncionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText salarioBase;
    Button calcularSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salarioBase = (EditText) findViewById(R.id.editTextTextPersonName);
        calcularSalario = (Button) findViewById(R.id.button);

        calcularSalario.setOnClickListener(c->{
            double salario, resultadoFinal, perc_aumento, perc_desconto;
            salario = Double.parseDouble(salarioBase.getText().toString());
            perc_aumento = (salario *  5)/100;
            perc_desconto = (salario * 7)/100;
            resultadoFinal = salario + perc_aumento - perc_desconto;
            Toast.makeText(this, "Salário a receber = " + resultadoFinal, Toast.LENGTH_SHORT).show();
        });
    }
}