package Loja.Vendas;

import java.util.List;

public class ProdutoAlimento extends Produto {
    private String dataValidade;
    private String dataFabricacao;
    private List<String> ingredientes;
    private boolean ehLiquido;
    private float peso;

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean ehLiquido() {
        return ehLiquido;
    }

    public void setEhLiquido(boolean ehLiquido) {
        this.ehLiquido = ehLiquido;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
