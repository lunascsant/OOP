public class Venda extends Transacao {
    private Cliente cliente;

    public Venda(String dataVenda, Produto produto, Cliente cliente, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
    }
}
