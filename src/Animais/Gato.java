package Animais;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.printf("\n %s Miou", getNome());
    }

}