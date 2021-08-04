public class Transacao {
    private String dataTransacao;
    private int qtde;
    private Produto produto;

    public Transacao (String dataTransacao, Produto produto, int qtde) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto obrigatório");
        }
        if (dataTransacao == null) {
            throw new IllegalArgumentException("Data da transação obrigatória");
        }
        if (qtde < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        this.dataTransacao = dataTransacao;
        this.produto = produto;
        this.qtde = qtde;
    }

    public Produto getProduto() {
        return produto;
    }

}
