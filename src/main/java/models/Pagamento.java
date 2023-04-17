package models;

import java.util.List;

public class Pagamento {
    private List<TipoPagamento> tipo;
    private List<Double> valor;

    public Pagamento() {
    }

    public Pagamento(List<TipoPagamento> tipo, List<Double> valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public List<TipoPagamento> getTipo() {
        return tipo;
    }

    public void setTipo(List<TipoPagamento> tipo) {
        this.tipo = tipo;
    }

    public List<Double> getValor() {
        return valor;
    }

    public void setValor(List<Double> valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tipo de Pagamento :" + tipo + "\n"
                + "Valor do Pagamento: " + valor + "\n";
    }

    
    
    
    

    
    

    
    
}
