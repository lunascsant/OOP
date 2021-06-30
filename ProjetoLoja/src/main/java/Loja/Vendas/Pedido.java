package Loja.Vendas;

public class Pedido {
    private String diaPedido;
    private String previsaoEntrega;
    private int numeroItens;
    private float valorPedido;

    public String getDiaPedido() {
        return diaPedido;
    }

    public void setDiaPedido(String diaPedido) {
        this.diaPedido = diaPedido;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public int getNumeroItens() {
        return numeroItens;
    }

    public void setNumeroItens(int numeroItens) {
        this.numeroItens = numeroItens;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void finalizaPedido (String dataFinalizacao, Carrinho carrinhoProntoParaSerFinalizado) {
        int quantidadeItens = 0;

        this.diaPedido = dataFinalizacao;
        this.previsaoEntrega = ("10 dias úteis após o dia ").concat(dataFinalizacao);
        this.valorPedido = carrinhoProntoParaSerFinalizado.calculaValorTotalCarrinho();

        for (Produto itemCarrinho : carrinhoProntoParaSerFinalizado.getItensCarrinho()) {
            quantidadeItens += 1;
        }

        this.numeroItens = quantidadeItens;
    }

}
