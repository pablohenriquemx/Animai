package Animais;

public class Dragao extends Ave{

    public Dragao(String nome) {
        super(nome);
    }

    public void voar(){
        System.out.printf("\n %s está voando", getNome());
    }

    public void soltarFogo(){
        System.out.printf("\n %s cuspindo fogo", getNome());
    }


}
