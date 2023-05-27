import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Banco-Brl \n");
        ExecutarMenu(EscolherOperacao());
    }

    public static int EscolherOperacao(){

        Scanner Leitor = new Scanner(System.in);
        int Escolha;

        do {
            System.out.println("1- Cadastrar Usuario");
            System.out.println("0- Sair");

            Escolha = Leitor.nextInt();
        }while (ValorInvalido(Escolha));

        return Escolha;
    }

    public static Boolean ValorInvalido(int Operacao) {
        return (Operacao != 1 && Operacao != 0);
    }

    public static void ExecutarMenu(int Escolha){
        switch (Escolha) {
            case 1:{
                MenuUsuario(Usuario.CadastrarUsuario());
            }
            case 0:
                System.exit(0);
        }
    }

    public static void MenuUsuario(Usuario usuario){
        System.out.println("Saldo atual: R$" + usuario.getConta().getSaldo());
        System.out.println("Status da Conta: " + usuario.getConta().getStatusDaConta());

        System.out.println("Qual operação deseja realizar ? :");
        System.out.println("1- Abrir uma conta");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
    }

}
