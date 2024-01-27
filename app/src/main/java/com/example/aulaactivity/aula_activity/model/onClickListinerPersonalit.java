package com.example.aulaactivity.aula_activity.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.aulaactivity.aula_activity.model.Activity2;
import com.example.aulaactivity.aula_activity.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class onClickListinerPersonalit implements View.OnClickListener
{

    private Context ac;

    public onClickListinerPersonalit(Activity ac) {
        this.ac = ac;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ac, Activity2.class);

        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");

        Usuario us = new Usuario("Carlos", "carlos@gmail.com", lista);

        intent.putExtra("nome", "Vini");
        intent.putExtra("idade", 30);
        intent.putExtra("objeto", us);
        ac.startActivity(intent);
    }
}
