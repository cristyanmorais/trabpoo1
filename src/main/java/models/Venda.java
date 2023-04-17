package models;

import java.util.List;
import java.util.Map;

public class Venda {
    private Cliente cliente; 
    private List<ItemVenda> itens; 
    private double valorTotal; 
    private Pagamento pagamento;
    private Map<Livro, Double> valorPorLivro;
    
    //Constructor

    public Venda() {
    }

    public Venda(Cliente cliente, List<ItemVenda> itens, double valorTotal, Pagamento pagamento, Map<Livro, Double> valorPorLivro) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.pagamento = pagamento;
        this.valorPorLivro = valorPorLivro;
    }

    //Getter e Setter

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Map<Livro, Double> getValorPorLivro() {
        return valorPorLivro;
    }

    public void setValorPorLivro(Map<Livro, Double> valorPorLivro) {
        this.valorPorLivro = valorPorLivro;
    }
    
    //toString

    @Override
    public String toString() {
        return  this.cliente + "\n"
                + "Dados dos Itens da Venda\n" + this.itens + "\n"
                + "Valor Total da Venda: " + this.valorTotal + "\n"
                + "Formas de Pagamento da Venda: " + this.pagamento + "\n";
    }
    
    
    
    
    
}
