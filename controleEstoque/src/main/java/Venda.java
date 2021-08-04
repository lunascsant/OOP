public class Venda extends Transacao {
    private Cliente cliente;

    public Venda(String dataVenda, Produto produto, Cliente cliente, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente obrigatório");
        }
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, int qtdeVendida) {
        if (qtdeVendida < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }

        if(produto.verificarEstoqueInsuficiente(qtdeVendida)) {
            produto.registrarHistorico("Estoque insuficiente");
            return false;
        }

        produto.debitarEstoque(qtdeVendida);
        produto.registrarHistorico("Valor venda = " + produto.calcularValorVenda(qtdeVendida));
        if(produto.verificarEstoqueBaixo()) {
            produto.registrarHistorico("Estoque baixo");
        }
        return true;
    }
}
