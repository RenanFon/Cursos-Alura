public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario zeca = new Funcionario();

        zeca.setNome("Zeca urubu");
        zeca.setCpf("243225435-45");
        zeca.setSalario(3254.90);

        System.out.println(zeca.getNome());
        System.out.println(zeca.getBonificacao());
    }
}
