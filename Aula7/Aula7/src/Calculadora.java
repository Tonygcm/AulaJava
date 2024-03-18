public class Calculadora {

    float x;
    float y;
    float soma;
    float sub;
    float div;
    float mult;

    public Calculadora(){

    }

    public void somar(){
        soma = x + y;
    }

    public void subtrair(){
        sub = x - y;
    }

    public void dividir(){
        if(y != 0){
            div = x / y;
        }
        else{
            System.out.println("Não é possível dividir por zero! ");
        }
    }

    public void multiplicar(){
        mult = x * y;
    }    
    
}
