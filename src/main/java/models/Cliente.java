package models;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    //Constructor

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    //Getter e Setter

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Dados do Cliente: \n"
             + "Nome do Cliente: " + nome + "\n"
             + "CPF do Cliente: " + cpf + "\n"
             + "Endereço do Cliente " + endereco + "\n";
    }
    
   
}
