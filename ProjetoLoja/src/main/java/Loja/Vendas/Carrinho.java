package Loja.Vendas;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itensCarrinho;

    public Carrinho() {
        this.itensCarrinho = new ArrayList<Produto>();
    }

    public List<Produto> getItensCarrinho() {
        return itensCarrinho;
    }

    public void adicionaItemAoCarrinho (Produto itemParaAdicionar) {
        this.itensCarrinho.add(itemParaAdicionar);
    }

    public void limpaCarrinho () {
        this.itensCarrinho.clear();
    }

    public float calculaValorTotalCarrinho () {
        float valorTotal = 0.0f;
        for (Produto itemCarrinho : this.itensCarrinho) {
            valorTotal += itemCarrinho.getPreco();
        }
        return valorTotal;
    }
}
