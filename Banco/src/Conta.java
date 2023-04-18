public class Conta {
    Double Saldo;

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    public void depositar(Double Valor) {
        this.Saldo += Valor;
    }

    public void Sacar(Double Valor) {
        this.Saldo -= Valor;
    }

    public static Conta NovaConta(){
        Conta conta = new Conta();

        return conta;
    }
}
