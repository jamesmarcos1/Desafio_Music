package com.example;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;
    public Object exibirInformacaoMusica;

    public String getAlbum() {
        return album;
    }
    public String getCantor() {
        return cantor;
    }
    public String getGenero() {
        return genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
public void exibirInformacaoMusica() {
    System.out.println(String.format("A musica %s, do cantor %s", album, cantor));
    
}

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 500) {
            return 10;
        } else {
            return 7;
        }
    }
}
