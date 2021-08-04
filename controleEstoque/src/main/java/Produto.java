import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private float precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private List<String> historico;

    public Produto (String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.historico = new ArrayList<String>();
    }

    public void debitarEstoque(int quantidade) {
        this.qtdeEstoque = this.qtdeEstoque - quantidade;
    }

    public void creditarEstoque(int quantidade) {
        this.qtdeEstoque = this.qtdeEstoque + quantidade;
    }

    public boolean verificarEstoqueBaixo() {
        return this.qtdeEstoque < this.estoqueMinimo;
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        return quantidade > this.qtdeEstoque;
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        return (quantidade + this.qtdeEstoque) > this.estoqueMaximo;
    }

    public float calcularValorVenda(int quantidade) {
        return this.precoUnit * quantidade;
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida) {
        Venda venda = new Venda(dataVenda, this, cliente, qtdeVendida);
        if (venda.vender(this, qtdeVendida)) {
            this.registrarHistorico("Venda do produto " + this.nome + " " + "em " + dataVenda + ", total de " + qtdeVendida + " unidades");
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, float precoUnit) {
        Compra compra = new Compra(dataCompra, this, fornecedor, qtdeCompra, precoUnit);
        if (compra.comprar(this, qtdeCompra)) {
            this.registrarHistorico("Compra do produto " + this.nome + " " + "em " + dataCompra + ", total de " + qtdeCompra + " unidades");
        }
    }

    public void registrarHistorico(String transacao) {
        this.historico.add(transacao);
    }

    public String exibirHistorico() {
        String historicoParaExibir = String.join("\n", this.historico);
        return historicoParaExibir;
    }
}
