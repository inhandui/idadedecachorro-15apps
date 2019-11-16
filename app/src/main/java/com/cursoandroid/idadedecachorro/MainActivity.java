package com.cursoandroid.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_idade;
    private Button btn_descobrirIdade;
    private TextView txt_resultadoIdade;

    private String entradaUsuario;
    private int valorDeEntrada;
    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_idade = findViewById(R.id.txt_idade);
        btn_descobrirIdade = findViewById(R.id.btn_descobrirIdade);
        txt_resultadoIdade = findViewById(R.id.txt_resultadoIdade);

        btn_descobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                entradaUsuario = txt_idade.getText().toString();

                if (!entradaUsuario.isEmpty()){
                    valorDeEntrada = Integer.parseInt(entradaUsuario);
                    resultado = valorDeEntrada * 7;

                    txt_resultadoIdade.setText(getString(R.string.resultado) + " " + resultado);

                }
                else {
                    //enviar mensagem de erro
                    txt_resultadoIdade.setText(R.string.erro);
                }
            }
        });

    }
}
