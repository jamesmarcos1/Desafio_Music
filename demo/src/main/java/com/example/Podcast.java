package com.example;

public class Podcast extends Audio {

    private String autor;
    private String previo;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getPrevio() {
        return previo;
    }

    public void setPrevio(String previo) {
        this.previo = previo;
    }

    @Override 
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 7;
        }
    }

}
