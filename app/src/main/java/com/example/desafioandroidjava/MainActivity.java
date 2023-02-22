package com.example.desafioandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool    = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina  = findViewById(R.id.editPrecoGasolina);
        textResultado      = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view){

    }


}
