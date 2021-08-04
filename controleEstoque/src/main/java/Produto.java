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
        if (qtdeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        if (estoqueMinimo < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        if (estoqueMaximo < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.historico = new ArrayList<String>();
    }

    public List<String> getHistorico() {
        return historico;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void debitarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        this.qtdeEstoque = this.qtdeEstoque - quantidade;
    }

    public void creditarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        this.qtdeEstoque = this.qtdeEstoque + quantidade;
    }

    public boolean verificarEstoqueBaixo() {
        return this.qtdeEstoque < this.estoqueMinimo;
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        return quantidade > this.qtdeEstoque;
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        return (quantidade + this.qtdeEstoque) > this.estoqueMaximo;
    }

    public float calcularValorVenda(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        return this.precoUnit * quantidade;
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida) {
        if (qtdeVendida < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        Venda venda = new Venda(dataVenda, this, cliente, qtdeVendida);
        if (venda.vender(this, qtdeVendida)) {
            this.registrarHistorico("Venda do produto " + this.nome + " " + "em " + dataVenda + ", total de " + qtdeVendida + " unidades");
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, float precoUnit) {
        if (qtdeCompra < 0) {
            throw new IllegalArgumentException("Quantidade positiva obrigatória");
        }
        Compra compra = new Compra(dataCompra, this, fornecedor, qtdeCompra, precoUnit);
        if (compra.comprar(this, qtdeCompra)) {
            this.registrarHistorico("Compra do produto " + this.nome + " " + "em " + dataCompra + ", total de " + qtdeCompra + " unidades");
        }
    }

    public void registrarHistorico(String transacao) {
        if (transacao == null) {
            throw new NullPointerException("Transação obrigatória");
        }
        this.historico.add(transacao);
    }

    public String exibirHistorico() {
        String historicoParaExibir = String.join("\n", this.historico);
        return historicoParaExibir;
    }
}
