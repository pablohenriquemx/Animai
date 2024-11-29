package estudando;

public class App {
    public static void main(String[] args){
        Funcionario fulano = new Funcionario("João", 1998);
        fulano.setAnoNascimento(2006);
        fulano.calcularIdade();
        fulano.imprimirDados();
        System.out.printf("Idade: " +fulano.calcularIdade());

    }
}
