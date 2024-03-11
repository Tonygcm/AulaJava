import java.util.Scanner;

public class Exercicios {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        ex01();

    }

    public static void ex01() {

        int valor;

        System.out.println("\nExercício 01\n");
        System.out.print("Informe um valor inteiro: ");
        valor = leitor.nextInt();

        if (valor > 10) {
            System.out.println("Valor informado é maior que 10");
        } else if (valor < 10) {
            System.out.println("Valor informado é menor que 10");
        } else {
            System.out.println("Valor informado é = 10");
        }
    }

}
