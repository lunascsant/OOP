package exercicioRelampagoPI;

public class Escola {

    private Cidade cidade;
    private Professor direcao;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Professor getDirecao() {
        return direcao;
    }

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public String getEscolaridadeDiretor () {
        return this.direcao.getEscolaridadeProfessor();
    }

    public String getNomeEstadoEscola () {
        return this.cidade.getNomeEstado();
    }

    public String getNomeDirecao () {
        return this.direcao.getNome();
    }
}
