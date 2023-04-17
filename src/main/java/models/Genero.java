package models;


public class Genero {
    private String nomeGenero;

    public Genero() {
    }

    public Genero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    @Override
    public String toString() {
        return  "Nome(s) do(s) Genêro(s): " + nomeGenero + "\n"; 
    }
    
    
}
