package exercicioRelampagoPI;

public class Curso {

    private TipoEnsino tipoEnsino;
    private Escola escola;
    private Professor coordenacao;

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Professor getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getEscolaridadeCoordenador () {
        return this.coordenacao.getEscolaridadeProfessor();
    }

    public String getNomeEstadoEscolaCurso () {
        return this.escola.getNomeEstadoEscola();
    }

    public String getDiretorEscola () {
        return this.escola.getNomeDirecao();
    }

    public String getNomeTipoEnsino () {
        return this.tipoEnsino.getNomeTipoEnsino();
    }
    public String getNomeCoordenadorCurso() {
        return this.coordenacao.getNome();
    }
}
