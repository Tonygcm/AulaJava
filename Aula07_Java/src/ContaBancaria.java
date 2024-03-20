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
        saldo += valor;
    }

    public void sacar(float valor){
        saldo -= valor;
    }

    public void extrato(){
        System.out.println("O saldo da conta");
    }
    
}
