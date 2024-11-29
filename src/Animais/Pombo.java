package Animais;

public class Pombo extends Ave{
    private int cartas = 15;
    public Pombo(String nome) {
        super(nome);
    }

    public void voar(){
        System.out.printf("\n %s está voando", getNome());
    }
    public void fazerPru(){
        System.out.printf("\n %s fez PRUUUUUUUh", getNome());
    }

    public int getCartas() {return this.cartas;}
    public void setCartas(int cartas) {this.cartas = cartas;}

    public void cartas(){
        cartas++;
        System.out.printf("\n %s enviou %d cartas", getNome(), getCartas());
    }
}
