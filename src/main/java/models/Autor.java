package models;

public class Autor {
    private String nome;
    
    //Constructor

    public Autor() {
    }

    public Autor(String nome) {
        this.nome = nome;
    }
    
    //Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do Autor" + nome + "\n";
    }
    
}
