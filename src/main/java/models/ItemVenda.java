package models;

public class ItemVenda {
    private Livro livro;
    private int quantidade;
    private double valorUnitarioDesconto;
    private double valorTotal;
    
    //Constructor

    public ItemVenda() {
    }

    public ItemVenda(Livro livro, int quantidade, double valorUnitarioDesconto, 
            double valorTotal) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.valorUnitarioDesconto = valorUnitarioDesconto;
        this.valorTotal = valorTotal;
    }
    
    //Getter e Setter

    public Livro getLivro() {
        return livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitarioDesconto() {
        return valorUnitarioDesconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitarioDesconto(double valorUnitarioDesconto) {
        this.valorUnitarioDesconto = valorUnitarioDesconto;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Dados dos Livros\n" + livro
                + "Quantidade de Livros Selecionadas: " + quantidade + "\n"
                + "Valor Unitário do Desconto: " + valorUnitarioDesconto + "\n"
                + "Valor Total da Venda: " + valorTotal + "\n";
    }
    
    
}
