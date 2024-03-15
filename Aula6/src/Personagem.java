public class Personagem {
    

    //Atributos
    String nome;
    String classe;
    int atk;
    int def;

    //Construtores
    public Personagem(){
    }

    //"this." faz referencia ao ATRIBUTO
    // é importante para que o programa consiga diferenciar variavel de atributp.
    public Personagem(String nome, String classe, int atk, int def){
        this.nome = nome;
        this.classe = classe;
        this.atk = atk;
        this.def = def;
    }


    //Métodos proprios
    public void copiarPersonagem(Personagem p){
        this.nome = p.nome;
        this.classe = p.classe;
        this.atk = p.atk;
        this.def = p.def;
    }

    public void mostrarPersonagem(){
        System.out.println("Nome: " + nome + "\nClasse: " + classe + "\nAtaque: " + atk + "\nDefesa: " + def);
    }

    public void apresentar(){
        System.out.println("Meu nome eh: " + nome);
    }

}
