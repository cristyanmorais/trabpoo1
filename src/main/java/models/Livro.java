package models;

import java.util.List;

public class Livro {
    private String titulo;
    private Editora editora;
    private List<Autor> autores;
    private String anoLancamento;
    private List<Genero> generos;
    private int numPaginas;
    private int quantidadeEstoque;
    private double precoVenda;

    public Livro() {
    }

    public Livro(String titulo, Editora editora, List<Autor> autores, String anoLancamento, List<Genero> generos, int numPaginas, int quantidadeEstoque, double precoVenda) {
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.anoLancamento = anoLancamento;
        this.generos = generos;
        this.numPaginas = numPaginas;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Titulo do Livro: " + titulo + "\n"
                + "Editora do Livro: " + editora + "\n"
                + "Autor(es) do Livro: " + autores + "\n"
                + "Ano de Lançamento do Livro: " + anoLancamento + "\n"
                + "Genero(s) do Livro: " + generos + "\n"
                + "Número de Páginas do Livro: " + numPaginas + "\n"
                + "Quantidade em Estoque do Livro: "+ quantidadeEstoque + "\n"
                + "Preço de Venda do Livro: "+ precoVenda + "\n";             
                
    }

}