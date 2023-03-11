import java.util.Scanner;

public class Operacoes {

    public static int RetornarTipooperacao(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer ?");
        System.out.println(" 1 -Soma \n 2-Subtração \n 3-Multiplicacao \n 4-Divisao");

        int iNumeroDaOperacao = Entrada.nextInt();

        if (!NumeroValido(iNumeroDaOperacao)){
            System.out.println("Insira uma operação valida");
            RetornarTipooperacao();
        }

        return iNumeroDaOperacao;
    }

    public static int ChamarOperacao(int valor){
        switch (valor){
            case 1:
                return Somar();
            case 2:
                return Subtrair();
            case 3:
                Multiplicar();
            case 4:
                break;
        }
       return 0;
    }

    public static Boolean NumeroValido(int valor) {
        return (valor >= 1 && valor <= 4);
    }

    public static int Somar(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");

        int valor1 = Entrada.nextInt();

        System.out.println("Digite o segundo numero");

        int valor2 = Entrada.nextInt();

        return valor1 + valor2;
    }

    public static int Subtrair(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");

        int valor1 = Entrada.nextInt();

        System.out.println("Digite o segundo numero");

        int valor2 = Entrada.nextInt();

        return valor1 - valor2;
    }

    public static int Multiplicar(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");

        int valor1 = Entrada.nextInt();

        System.out.println("Digite o segundo numero");

        int valor2 = Entrada.nextInt();

        return valor1 * valor2;
    }

}
