public class Funcionario {

    // protected (classes herdadas conseguem utilizar as variaveis)

    private String matricula;
    private String nome;

    public Funcionario(){
    }

    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
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
