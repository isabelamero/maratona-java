package javacore.Hdeheranca.Exercicios.Animal;

public class MainAnimal {
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro("Ursa", 1, "vira-lata");
        Gato gato = new Gato("Jinx", 5, "laranha");
        Passaro passaro = new Passaro("luma", 2, 2.5);
        Animal animal = new Animal();

        animal.emitirSom();
        animal.mover();
        cachorro.emitirSom();
        gato.emitirSom();
        passaro.mover();

    }
}
