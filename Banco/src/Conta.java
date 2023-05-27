public class Conta {
    private Double Saldo;
    private String StatusDaConta;

    public static Conta NovaConta(){
        Conta conta = new Conta();
        conta.setStatusDaConta("Ativa");
        return conta;
    }

    public String getStatusDaConta() {
        return this.StatusDaConta;
    }

    public void setStatusDaConta(String statusDaConta) {
        this.StatusDaConta = statusDaConta;
    }


    public Conta() {
        this.Saldo = 0.00;
        this.StatusDaConta = "Inativa";
    }

    public Double getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(Double saldo) {
        this.Saldo = saldo;
    }

    public void depositar(Double Valor) {
        this.Saldo += Valor;
    }

    public void Sacar(Double Valor) {
        this.Saldo -= Valor;
    }

}
