package com.example.aulaactivity.aula_activity.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.aulaactivity.R;
import com.example.aulaactivity.aula_activity.model.Usuario;

public class Activity2 extends AppCompatActivity {

    private TextView txtNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtNome = findViewById(R.id.txtActivity2);
        //Recuperar os dados enviados da primeira activity
        Bundle dados = getIntent().getExtras();

        Usuario us = (Usuario) dados.getSerializable("objeto");

        txtNome.setText(us.getL().get(0));
    }
}