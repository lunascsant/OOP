package Loja.Vendas;

public class ProdutoEletronico extends Produto {
    private String cor;
    private boolean usaPilha;
    private boolean temBateria;
    private String tecnologiaConexao;

    public String getTecnologiaConexao() {
        return tecnologiaConexao;
    }

    public void setTecnologiaConexao(String tecnologiaConexao) {
        this.tecnologiaConexao = tecnologiaConexao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean usaPilha() {
        return usaPilha;
    }

    public void setUsaPilha(boolean usaPilha) {
        this.usaPilha = usaPilha;
    }

    public boolean temBateria() {
        return temBateria;
    }

    public void setTemBateria(boolean temBateria) {
        this.temBateria = temBateria;
    }
}
