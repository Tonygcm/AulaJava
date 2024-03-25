public class Contato {

    // Atributos

    private String nome;
    private int telefone;
    // private String email;

    // Construtores

    public Contato() {
    }

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /*
     * public String getEmail() {
     * return email;
     * }
     * 
     * public void setEmail(String email) {
     * this.email = email;
     * }
     */

}
