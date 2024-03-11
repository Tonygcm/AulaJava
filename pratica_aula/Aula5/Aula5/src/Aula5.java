public class Aula5 {
    
public static void main(String[] args) {
    /* 
    * int  x;
    * int[] y = new int[3];
    * Scanner scaner = new Scanner(System.in);
    */


    // Declaração de novo objeto do tipo aluno
    Aluno a1 = new Aluno();

    // Armazenar dados no a1
    a1.nome = "Guilherme Coelho";
    a1.curso = "ADS";
    a1.turno = "Manhã";
    a1.campus = "Osório";

    System.out.println("Dados do aluno a1");
    System.out.println("Nome: " + a1.nome + "\n" + 
        "Curso: " + a1.curso + "\n" +
        "Turno: " + a1.turno + "\n" +
        "Campus: " + a1.campus);

}

}
