package models;


public class TipoPagamento {
    private String nomePagamento;

    public TipoPagamento() {
    }

    public TipoPagamento(String nomePagamento) {
        this.nomePagamento = nomePagamento;
    }

    public String getNomePagamento() {
        return nomePagamento;
    }

    public void setNomePagamento(String nomePagamento) {
        this.nomePagamento = nomePagamento;
    }

    @Override
    public String toString() {
        return  "Forma de Pagamento Selecionada: "+ nomePagamento + "\n"; 
    }
    
    
}
