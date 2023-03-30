package com.example.ac1_p2.model;

public class Album {
    private String  banda;
    private int ano;
    private  String saibaMais;
    private String fotografo;
    private int image;


    public Album() {
    }

    public Album(String banda, int ano, String saibaMais, String fotografo, int image) {
        this.banda = banda;
        this.ano = ano;
        this.saibaMais = saibaMais;
        this.fotografo = fotografo;
        this.image = image;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSaibaMais() {
        return saibaMais;
    }

    public void setSaibaMais(String saibaMais) {
        this.saibaMais = saibaMais;
    }

    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
