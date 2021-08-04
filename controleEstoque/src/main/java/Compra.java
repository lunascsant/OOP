public class Compra extends Transacao {
    private float precoUnit;
    private Fornecedor fornecedor;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeCompra, float precoUnit) {
        super(dataCompra, produto, qtdeCompra);
        if (fornecedor == null) {
            throw new IllegalArgumentException("Fornecedor obrigatório");
        }
        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;
    }

    public boolean comprar(Produto produto, int qtdeCompra) {
        if(produto.verificarEstoqueExcedente(qtdeCompra)) {
            produto.registrarHistorico("Estoque excedente");
            return false;
        }

        produto.creditarEstoque(qtdeCompra);
        return true;
    }
}
