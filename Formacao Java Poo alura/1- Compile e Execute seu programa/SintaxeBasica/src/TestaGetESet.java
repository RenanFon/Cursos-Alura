public class TestaGetESet {
    public static void main(String[] args) {
       Conta conta = new Conta();
       conta.setNumero(2134);

        Cliente Renan = new Cliente();

        conta.SetTitular(Renan);

        Renan.setNome("Renan o fera");

        System.out.println(conta.getTitular().getNome());
    }
}
