public class Compra extends Transacao {
    private int precoUnit;
    private Fornecedor fornecedor;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeCompra, int precoUnit) {
        super(dataCompra, produto, qtdeCompra);
        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;
    }
}
