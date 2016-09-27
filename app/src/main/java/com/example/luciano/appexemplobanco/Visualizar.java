package com.example.luciano.appexemplobanco;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Visualizar extends AppCompatActivity {

    private ListView pessoasView;
    private ArrayAdapter<Pessoa> adpPessoas;
    private List<Pessoa> listaPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        pessoasView = (ListView) findViewById(R.id.lstView);
        Iterator<Pessoa> pessoas = Pessoa.findAll(Pessoa.class);

        listaPessoas = new ArrayList<>();
        adpPessoas = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1);

        while (pessoas.hasNext()){
            Pessoa pessoa = pessoas.next();
            listaPessoas.add(pessoa);
        }

        adpPessoas.addAll(listaPessoas);
        pessoasView.setAdapter(adpPessoas);
    }
}
