package models;

public class Editora {
    private String nome;
    private Endereco endereco;
    
    //Constructor

    public Editora() {
    }

    public Editora(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    //Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome da Editora: " + nome + "\n"
                + "Endereço da Editora: " + endereco + "\n";
        
    }
 
}
