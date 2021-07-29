import java.util.List;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private float precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private List<String> historico;

    public Produto (String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }
}
