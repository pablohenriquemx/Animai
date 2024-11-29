package estudando;

public class Funcionario {
    private String nome;
    private int anoNascimento;

    public Funcionario(){}

    public Funcionario(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
    }

    public int calcularIdade(){
        return 2024 - this.anoNascimento;
    }
}
