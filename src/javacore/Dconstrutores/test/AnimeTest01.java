package javacore.Dconstrutores.test;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "MAD HOUSE");


        //anime.init("Akudama Drive 2", "TV", 12, "Ação");
        anime.imprime();
    }
}
