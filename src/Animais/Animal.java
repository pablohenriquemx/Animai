package Animais;

public class Animal {
    private String nome;

    public Animal(){}

    public Animal(String nome) {
        this.nome = nome;
    }
    public void comer(){
        System.out.printf("\n %s comeu", nome);
    }

    public void beber(){
        System.out.printf("\n %s bebeu", nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


}
