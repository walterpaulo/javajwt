package com.demo.javajwt.domain.model;

public interface IRepository {
    int getId();
    void setId(int id);

    String getNome();
    void setNome(String name);

    String getUrl();
    void setUrl(String url);

    String getLinguagemUrl();
    void setLinguagemUrl(String linguagemUrl);


}
