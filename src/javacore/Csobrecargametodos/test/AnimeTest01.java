package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();


        anime.init("Akudama Drive 2", "TV", 12, "Ação");
        anime.imprime();
    }
}
