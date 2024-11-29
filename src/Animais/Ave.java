package Animais;

public class Ave extends Animal{
    public Ave(String nome) {
        super(nome);
    }
    public void voar(){
        System.out.printf("\n %s está voando", getNome());
    }
}
