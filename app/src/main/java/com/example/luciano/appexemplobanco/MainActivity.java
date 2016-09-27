package com.example.luciano.appexemplobanco;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.luciano.appexemplobanco.Visualizar;

public class MainActivity extends AppCompatActivity {

    private Button Salvar;
    private Button Ver;
    private EditText Nome;
    private EditText Sobrenome;
    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Salvar = (Button)findViewById(R.id.btSalvar);
        Ver = (Button) findViewById(R.id.btrecuperar);
        Nome = (EditText) findViewById(R.id.edtNome);
        Sobrenome = (EditText) findViewById(R.id.edtSobrenome);

        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pessoa = new Pessoa(Nome.getText().toString(), Sobrenome.getText().toString());
                pessoa.save();

            }
        });

        Ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Visualizar.class);
                startActivity(it);
            }
        });

    }
}
