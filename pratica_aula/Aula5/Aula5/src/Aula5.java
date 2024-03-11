public class Aula5 {
    
public static void main(String[] args) {
    /* 
    * int  x;
    * int[] y = new int[3];
    * Scanner scaner = new Scanner(System.in);
    */


    // Declaração de novo objeto do tipo aluno
    Aluno a1 = new Aluno();

    //  Armazenar dados no a1
    a1.nome = "Guilherme Coelho";
    a1.curso = "ADS";
    a1.turno = "Manhã";
    a1.campus = "Osório";

    System.out.println("Dados do aluno a1");
    System.out.println("Nome: " + a1.nome + "\n" + 
        "Curso: " + a1.curso + "\n" +
        "Turno: " + a1.turno + "\n" +
        "Campus: " + a1.campus);
    

    Aluno a2 = new Aluno();

    System.out.println("\nCadastro do aluno a2:");

    System.out.println("Informe o nome do aluno: ");
    a2.nome = Console.lerString();
    System.out.println("Informe o curso do aluno: ");
    a2.curso = Console.lerString();
    System.out.println("Informe o turno do aluno: ");
    a2.turno = Console.lerString();
    System.out.println("Informe o campus do aluno: ");
    a2.campus = Console.lerString();


    System.out.println("\nDados do aluno a2: ");
    System.out.println(a2.toString());


    // Intanciando aluno a3
    Aluno a3 = new Aluno("Fulano", "ADS", "Noite", "Osório");

    System.out.println("\nDados do aluno a3: ");
    System.out.println(a3.toString());
}

}
