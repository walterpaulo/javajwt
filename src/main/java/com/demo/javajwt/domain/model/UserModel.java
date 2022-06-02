package com.demo.javajwt.domain.model;

public class UserModel {
    private int id;
    private String name;
    private String password;
    private String grupo;

    public UserModel(int id, String name, String password, String grupo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}

