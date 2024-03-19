public class ContaBancaria {

    int idConta;
    String nomeTitular;
    float saldo;
    float deposito;

    public ContaBancaria(int idConta, String nomeTitular){
        this.idConta = idConta;
        this.nomeTitular = nomeTitular;
        saldo = 0;
    }

    public void depositar(float valor){
        float deposito = this.saldo + valor;
    }

    public void sacar(){

    }

    public void extrato(){
        
    }
    
}
