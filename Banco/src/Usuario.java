import java.util.Scanner;

public class Usuario {
    private String nome;
    private String email;
    private String CPF;
    private String Endereco;
    private Conta conta;

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

        System.out.println("Cadastro realizado com sucesso !");

        return usuario;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

}
