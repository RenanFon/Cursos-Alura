import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        escolhaOperacao();

    }

    public static Integer escolhaOperacao() {
        int Escolha;

        Scanner Leitor = new Scanner(System.in);

        do {
            System.out.println("Qual Operação deseja realizar ?:");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("0- Sair");

            Escolha =  Leitor.nextInt();
        }while (entradaInvalida(Escolha));

        return Escolha;
    }

    public static boolean entradaInvalida(int Entrada){
        boolean Invalido;

        Invalido = Entrada != 1 || Entrada != 2 || Entrada != 0;

        if(Invalido){
           System.out.println("Opção invalida, por favor digite uma opção valida !");
        }

        return Invalido;
    }

}