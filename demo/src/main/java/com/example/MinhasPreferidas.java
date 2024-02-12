package com.example;

public class MinhasPreferidas {
    
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso mundial");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção para inovar a playlist");
        }
    }
}
