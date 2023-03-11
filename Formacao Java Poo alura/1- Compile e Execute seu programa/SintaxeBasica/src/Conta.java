public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(){

    }


    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if ( this.saldo >= valor){
            this.sacar(valor);
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){

        return this.saldo;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não é permitido valor menor ou igual a 0");
            return; //este comando faz ele retornar
        }
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void SetTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero(){

        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Numero invalido");
            return;
        }
        this.numero = numero;
    }

}
