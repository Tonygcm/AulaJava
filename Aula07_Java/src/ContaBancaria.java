public class ContaBancaria {

    private int idConta;
    private String nomeTitular;
    private float saldo;
    
    public int getIdConta(){
        return this.idConta;
    }

    public void setIdConta(int idConta){
        this.idConta = idConta;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public ContaBancaria(){
    }

    public ContaBancaria(int idConta, String nomeTitular, float saldo){
        this.idConta = idConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public void sacar(float valor){
        saldo -= valor;
    }

    public void extrato(){
        System.out.println("\nNº Conta: " + idConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println();
    }
    
}
