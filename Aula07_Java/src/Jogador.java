public class Jogador {

    private String nome;
    private float pont;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public float getPont() {
        return pont;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPont(float pont) {
        this.pont = pont;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Jogador() {
    }

    public Jogador(String nome, float pont, int nivel){
        this.nome = nome;
        this.pont = pont;
        this.nivel = nivel;
    }

    public void subirNivel(){
        System.out.println(nome + " subiu de nível!");
        nivel ++;
    }

    public void subirPont(float valor){
        System.out.println("\nPontos adicionados: " + valor);
        System.out.println(nome + " o jogador atingiu uma nova pontuação!");
        pont += valor;
    }

    public void exibirInfo(){
        System.out.println("\nNome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontuação: " + pont);
            
    }

}
