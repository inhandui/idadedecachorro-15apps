package com.cursoandroid.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_idade;
    private Button btn_descobrirIdade;
    private TextView txt_resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_idade = findViewById(R.id.txt_idade);
        btn_descobrirIdade = findViewById(R.id.btn_descobrirIdade);
        txt_resultadoIdade = findViewById(R.id.txt_resultadoIdade);

    }
}
