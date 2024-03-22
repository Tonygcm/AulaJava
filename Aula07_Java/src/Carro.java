public class Carro {


    private String marca;
    private String modelo;
    private int ano;
    private float velAtual;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getVelocAtual() {
        return velAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocAtual(float velocAtual) {
        this.velAtual = velocAtual;
    }
    //Construtor não parametrizado, carro base quando utilizar esse construtor
    public Carro(){   
        marca = "Volkswagen";
        modelo = "Fusca";
        ano = 1966;
        velAtual = 0; 
    }

    public Carro(String marca, String modelo, int ano, float velAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velAtual = velAtual;
    }

    public void acelerar(){
        
        if(velAtual == 80){
            System.out.println(marca + " " + modelo + " está na velocidade máxima!");
            return;
        }
        velAtual += 10;
        System.out.println(marca + " " + modelo + " aumenta sua velocidade para: " + velAtual + " Km/h");
    }

    public void frear(){

        if(velAtual == 0){
            System.out.println(marca + " " + modelo + " está parado!");
            return;
        }
        velAtual -= 10;
        System.out.println(marca + " " + modelo + " diminui sua velocidade para: " + velAtual + " Km/h");
    }

    public void exibirInfo(){
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
}
