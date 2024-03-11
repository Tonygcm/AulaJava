public class ExAula04 {
    
    public static void ex05() {
        
    int[] vet = new int[5];
    int valor;
    int qtde = 0;

    System.out.println("\nExercício 05");
    System.out.println("\nInforme 5 valores inteiros para compor o vetor:\n ");

    for (int i = 0; i < vet.length; i++) {

        System.out.println("Valor para pos " + i + ": ");
        vet[i] = Console.lerInt();

    }

    System.out.println("\nVetor registrado: ");
    System.out.println("Informe outro valor: ");
    valor = Console.lerInt();

    for (int i = 0; i < vet.length; i ++) {
        if(vet[i] == valor){
            qtde++;
        }

    System.out.println("\nO valor" + valor + " aparece " + qtde + " vezes no vetor");
    

    }

    }
    
    public static void ex06(){

        float[] vet = new float[5];
        float[] pesos = {4, 1, 2, 2, 1};

    }



}
