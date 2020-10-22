package com.brab.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //recuperando os dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if ( numero == 0)
        {
            imageResultado.setImageResource( R.drawable.moeda_cara);
            //cara
        }else {
            imageResultado.setImageResource( R.drawable.moeda_coroa);
            //coroa
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//
//                startActivity( intent );
                finish();

            }
        });
    }
}