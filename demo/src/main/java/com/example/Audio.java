package com.example;

public class Audio {
    private String titulo;
    private String autor;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
        
    public void curti() {
        this.totalCurtidas++;
    }

    public void reproduziu() {
        this.totalReproducoes++;
    }
}
