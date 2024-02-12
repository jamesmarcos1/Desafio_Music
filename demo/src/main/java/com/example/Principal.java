package com.example;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Como tudo deve ser");
        minhaMusica.setCantor("Charlie Brown Jr");

        Musica minhaMusica2 = new Musica();
        minhaMusica2.setTitulo("Eu ligo para Você");
        minhaMusica2.setCantor("Ze neto & Cristiano");

        Musica minhaMusica3 = new Musica();
        minhaMusica3.setTitulo("Largado as Traças");
        minhaMusica3.setCantor("Ze neto & Cristiano");

        for(int i = 0; i < 1000; i++) {
            minhaMusica.reproduziu();
        }

        for(int i = 0; i < 50; i++) {
            minhaMusica.curti();
        }

        for(int i = 0; i < 400; i++) {
            minhaMusica2.reproduziu();
        }

        for(int i = 0; i < 50; i++) {
            minhaMusica2.curti();
        }

        for(int i = 0; i < 5000; i++) {
            minhaMusica3.reproduziu();
        }

        for(int i = 0; i < 10; i++) {
            minhaMusica3.curti();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setAutor("Marcos");

        for (int i = 0; i < 100; i++) {
            podcast.reproduziu();
        }

        for (int i = 0; i < 300; i++) {
            podcast.curti();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);
        preferidas.inclui(minhaMusica2);
        preferidas.inclui(minhaMusica3);
        
    }
}
