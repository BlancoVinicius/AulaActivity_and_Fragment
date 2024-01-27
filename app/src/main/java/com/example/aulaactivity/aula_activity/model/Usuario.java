package com.example.aulaactivity.aula_activity.model;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable {

    private String name;
    private String email;
    private List<String> l;

    public Usuario(String name, String email, List<String> l) {
        this.name = name;
        this.email = email;
        this.l = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getL() {
        return l;
    }
}
