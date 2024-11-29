package Animais;

public class App {
    public static void main(String [] args){
        Cachorro cachorro = new Cachorro("Caramelo");

        cachorro.lamber();
        cachorro.latir();
        cachorro.beber();
        cachorro.comer();
        System.out.println("\n________________________________");

        Gato gato = new Gato("Frajola");

        gato.miar();
        gato.beber();
        gato.comer();
        System.out.println("\n________________________________");

        Dragao dragao = new Dragao("Banguela");
        dragao.comer();
        dragao.voar();
        dragao.soltarFogo();
        System.out.println("\n________________________________");

        Pombo pombo = new Pombo("Pombo Osvaldo");
        pombo.comer();
        pombo.voar();
        pombo.fazerPru();
        pombo.cartas();
        System.out.println("\n________________________________");

    }
}
