import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String CPF;
    private String Endereco;

    public static Usuario CadastrarUsuario(){
        Scanner Leitor = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Digite seu nome:");
        usuario.setNome(Leitor.nextLine());

        System.out.println("Digite seu E-mail:");
        usuario.setEmail(Leitor.nextLine());

        System.out.println("Diga seu CPF:");
        usuario.setCPF(Leitor.nextLine());

        System.out.println("Digite seu endereço");
        usuario.setEndereco(Leitor.nextLine());

        return usuario;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    private Conta conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

}
