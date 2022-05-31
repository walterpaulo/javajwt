package com.demo.javajwt.infra.model;

import com.demo.javajwt.domain.model.IRepository;

public class Repository implements IRepository {
    private int id;
    private String name;
    private String url;
    private String linguagemUrl;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return this.name;
    }

    @Override
    public void setNome(String name) {
        this.name = name;
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getLinguagemUrl() {
        return this.linguagemUrl;
    }

    @Override
    public void setLinguagemUrl(String linguagemUrl) {
        this.linguagemUrl = linguagemUrl;
    }
}
