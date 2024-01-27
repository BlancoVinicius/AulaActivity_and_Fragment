package com.example.aulaactivity.aula_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aulaactivity.R;

public class FragmentsAulaActivity extends AppCompatActivity {

    private Button btnContato, btnConversas;
    private ContatosFragment contatos;
    private ConversasFragment conversas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_aula);

        btnContato = findViewById(R.id.btnContato);
        btnConversas = findViewById(R.id.btnConversas);

        //para retirar o relevo da action bar
        getSupportActionBar().setElevation(0);

        contatos = new ContatosFragment();
        //Configurar para abrir o fraguimento
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_conteudo, contatos);
        //encerra trasation
        fragmentTransaction.commit();

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversas = new ConversasFragment();
                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.frame_conteudo, conversas);
                fragmentTransaction1.commit();
            }
        });

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatos = new ContatosFragment();
                //Configurar para abrir o fraguimento
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_conteudo, contatos);
                //encerra trasation
                fragmentTransaction.commit();
            }
        });

    }
}