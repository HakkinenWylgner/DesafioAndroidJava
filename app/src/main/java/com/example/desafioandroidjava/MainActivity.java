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

        //recuperar valores digitas
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //Validar os campos digitados
        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if ( camposValidados){

            //Convertendo string para números
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);
            String texto;
            if (valorAlcool / valorGasolina >= 0.7) {
                texto = "É melhor utilizar gasolina";
        /* Fazer cálculo de menor preço
        Se (valorAlcool / valorGasolina) >= 0.7 é melhor utilizar gasolina
        se não é melhor utilizar álcool
        */
            }else {
                texto = "É melhor utilizar álcool";
            }

        }

    }
    public Boolean validarCampos ( String pAlcool, String pGasolina) {
        Boolean camposValidados = true;
        if (pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;
        } else if (pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;
        }

        return camposValidados;
    }


}
