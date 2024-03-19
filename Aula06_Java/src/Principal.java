public class Principal {

    public static void main(String[] args) {

        exPersonagem();

    }

    public static void exPessoa() {

        // Nova instancia pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Guilherme";
        p1.idade = 22;

        System.out.println("Pessoa p1: " + p1.nome + "\nIdade p1: " + p1.idade);

        // Nova instacia de pessoa, mas utilizando o
        // construtor parametrizado
        Pessoa p2 = new Pessoa("Fulano", 45);

        System.out.println("Pessoa p2: " + p2.nome + "\nIdade p2: " + p2.idade);

        Pessoa p3 = new Pessoa();

        // p3 aponta para o mesmo endereço de memória de p2:
        // (p2 e p3 são o MESMO objeto)
        p3 = p2;

        // Sendo o mesmo objeto, não importa se alteramos
        // os nomes de ambos.
        p2.nome = "Ciclano";
        p3.nome = "Beltrano";

        // Na hora de exibir os nomes p2 e p3, veremos que
        // ambos se chamam "Beltrano", pois foi a última
        // alteração feita para o nome de p3(logo, p2 tbm)
        System.out.println("Pessoa p2: " + p2.nome + "\nPessoa p3: " + p3.nome);

        // nova instancia de pessoa, com os mesmos dados de p1
        Pessoa p4 = new Pessoa(p1.nome, p1.idade);
        p4.idade = 35;

        System.out.println("Pessoa p4: " + p4.nome + "\nIdade p4: " + p4.idade);

        // alterar nome de p4
        p4.nome = "José";

        System.out.println("Pessoa p1: " + p1.nome + "\nPessoa p4: " + p4.nome);

    }

    public static void exPersonagem() {

        // Nova instância de personagem utilizando o construtor parametrizado
        Personagem p1 = new Personagem("Guilherme", "Paladino", 200, 200);

        // Apresentar personagem
        p1.apresentar();

        // Mostrar dados de p1
        System.out.println("Personagem 1: ");
        p1.mostrarPersonagem();

        // Nova instância de personagem utilizando o construtor padrâo
        Personagem p2 = new Personagem();
        p2.copiarPersonagem(p1);

        // Alterar dados de p2
        p2.nome = "Fulano";
        p2.classe = "Mago";

        System.out.println("Personagem 2: ");

        Personagem p3 = new Personagem();

        System.out.println("\nCadastro do Personagem 3: ");

        System.out.println("Nome: ");
        p3.nome = Console.lerString();

        System.out.println("Classe: ");
        p3.classe = Console.lerString();

        System.out.println("Pontos de ataque: ");
        p3.atk = Console.lerInt();

        System.out.println("Pontos de defesa: ");
        p3.def = Console.lerInt();

        System.out.println("\nPersonagem P3: ");
        p3.mostrarPersonagem();

    }

}