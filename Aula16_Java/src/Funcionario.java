public class Funcionario {

    // protected (classes herdadas conseguem utilizar as variaveis)

    private int matricula;
    private String nome;

    public Funcionario(){
    }

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nMatrícula: " + matricula + "\nNome: " + nome;
    }
    
}
