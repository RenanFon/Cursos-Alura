import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int TipoOperacao = Operacoes.RetornarTipooperacao();

        int Resultado = Operacoes.ChamarOperacao(TipoOperacao);

        System.out.println("O Resultado é : "+ Resultado);
    }


}


