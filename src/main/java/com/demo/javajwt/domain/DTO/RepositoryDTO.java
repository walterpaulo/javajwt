package com.demo.javajwt.domain.DTO;

public class RepositoryDTO {
    private int id;
    private String name;
    private String url;
    private String linguagemUrl;

    public RepositoryDTO(int id, String name, String url, String linguagemUrl) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.linguagemUrl = linguagemUrl;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLinguagemUrl() {
        return linguagemUrl;
    }

    public void setLinguagemUrl(String linguagemUrl) {
        this.linguagemUrl = linguagemUrl;
    }
}
