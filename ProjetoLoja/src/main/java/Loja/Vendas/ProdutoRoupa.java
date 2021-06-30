package Loja.Vendas;

public class ProdutoRoupa extends Produto {
    private String tamanho;
    private String materialTecido;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterialTecido() {
        return materialTecido;
    }

    public void setMaterialTecido(String materialTecido) {
        this.materialTecido = materialTecido;
    }
}
