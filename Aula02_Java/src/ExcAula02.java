import java.util.Scanner;

public class ExcAula02 {
    
    static Scanner leitor = new Scanner(System.in);

    public static void main (String[] args) {

        Ex10();

    }
    
        //Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número menor ou igual a 10!”, caso este número seja menor ou igual.

    public static void Ex01() {
        

        int num;

        System.out.println("\nEXERCÍCIO 01\n");
        System.out.print("Informe um valor inteiro: ");

        num = leitor.nextInt();

        if(num > 10)
            System.out.println("Número maior do que 10!");
        else
            System.out.println("Número menor ou igual a 10!");
                 

    }
    
        //Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.

    public static void Ex02() {

        int a;
        int b;
        int resultado;

        System.out.println("\nEXERCÍCIO 02\n");

        System.out.print("Informe um valor inteiro: ");
            a = leitor.nextInt();
        System.out.print("Informe um valor inteiro: ");
            b = leitor.nextInt();
        resultado = a + b;
        System.out.print("Resultado da soma: " + resultado);
    }

        //Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida

    public static void Ex03() {

        int A;
        int B;

        System.out.println("\nEXERCÍCIO 03\n");
        System.out.print("Informe um valor inteiro: ");
            A = leitor.nextInt();
        System.out.print("Informe um valor inteiro: ");
            B = leitor.nextInt();
        if(A > B)
            System.out.print("O maior numero eh: " + A);
        else if(B > A)
            System.out.print("O maior numero eh: " + B);
        else
            System.out.print("Sequencia de numeros eh invalida.");

    }

        //Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos

    public static void Ex04() {

        float a;
        float b;
        float soma;
        float sub;
        float mult;
        float div;

        System.out.println("\nEXERCÍCIO 04\n");
        System.out.print("Informe um valor: ");
            a = leitor.nextFloat();
        System.out.print("Informe um valor: ");
            b = leitor.nextFloat();

        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a / b;

        System.out.printf("A soma eh: " + soma + "\nA subtracao eh: " + sub + "\nA multiplicação eh: " + mult + "\nA divisao eh: " + div);

        

    }

        //Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B, e o valor da variável B passe a ser o valorda variável A. Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.

    /*public static void Ex05() {

        int A;
        int B;

        System.out.println("\nEXERCÍCIO 05\n");
        System.out.print("Informe um valor inteiro: ");
            A = leitor.nextInt();
        System.out.print("Informe um valor inteiro: ");
            B = leitor.nextInt();
        System.out.print("Valores originais respectivamente: " + A + " - " + B);
    
        System.out.print("Valores trocados: " + A + " - " + B);

    }*/

        //Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:F = (9 * C + 160) / 5

    public static void Ex06() {

        float cel;
        float fah;

        System.out.println("\nEXERCÍCIO 06\n");
        System.out.print("Informe uma temperatura em graus celsius: ");
            cel = leitor.nextFloat();

        fah = (9 * cel + 160) / 5;

        System.out.print("A temperatura em Fahrenheit eh: " + fah);

    }

        //Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo,solicitar ao usuário que digite novamente, até que essa condição seja atendida.

    public static void Ex07() {

        float num;
        
        System.out.println("\nEXERCÍCIO 07\n");
        System.out.print("Informe um numero: ");
            num = leitor.nextFloat();

        while (num < 100 || num > 200) {
            System.out.print("Informe um numero novamente: ");
                num = leitor.nextFloat();
        };
        
        System.out.print("Este numero esta no intervalo entre 100 e 200.");

    }

        //Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou igual a 50, outra se ele for menor que 50.

    public static void Ex08() {

        float num;
        
        System.out.println("\nEXERCÍCIO 08\n");
        System.out.print("Informe um numero: ");
            num = leitor.nextFloat();

        if(num < 50)
            System.out.println("Este numero eh menor que 50.");
        else
            System.out.println("Este numero eh maior ou igual a 50.");
    }

    //Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. Caso sejam diferentes, informe que são diferentes e qual número é o maior.

    public static void Ex09() {

        float a;
        float b;
        
        System.out.println("\nEXERCÍCIO 09\n");
        System.out.print("Informe um numero: ");
            a = leitor.nextFloat();
        System.out.print("Informe um numero: ");
            b = leitor.nextFloat();

        if(a > b)
            System.out.println("O numero " + a + " eh maior. ");
        else if(b > a)
            System.out.println("O numero " + b + " eh maior. ");
        else
            System.out.println("Os numeros sao iguais. ");
           
    }

    //Escreva um algoritmo que leia um número de 1 a 50. Escreva-os na tela indo do numero digitado até o número 50. Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”, e solicitar uma nova entrada até que essa condição seja atendida.


    public static void Ex10() {

        float num;
        
        System.out.println("\nEXERCÍCIO 10\n");
        System.out.print("Informe um numero: ");
            num = leitor.nextFloat();

        

        

    }

    //SoftwareA expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética(PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), r é arazão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo queencontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n = 7, r= 3. Resultado: an = 28

    public static void Ex11() {

        float num;
        
        System.out.println("\nEXERCÍCIO 11\n");
        System.out.print("Informe um numero: ");
            num = leitor.nextFloat();

        

        

    }
    
    //Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volumecalculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura; Exemplo: raio = 10, altura = 15. Volume = 4710

    public static void Ex12() {

        float num;
        
        System.out.println("\nEXERCÍCIO 12\n");
        System.out.print("Informe um numero: ");
            num = leitor.nextFloat();

        

        

    }


}
