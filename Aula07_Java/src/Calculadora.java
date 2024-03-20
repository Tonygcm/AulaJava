public class Calculadora {

    public Calculadora(){

    }

    public float somar(float x, float y){
        return x + y;
    }

    public float subtrair(float x, float y){
        return x - y;
    }

    public float dividir(float x, float y){
        if (y == 0) {
            return x;
        }

        return x / y;
    }

    public float multiplicar(float x, float y){
        return x * y;
    }    
    
}
