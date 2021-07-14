package exercicioRelampagoPI;

public class Professor extends Pessoa {

    private String nome;
    private Curso contratacao;

    public Professor (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getEscolaridadeProfessor () {
        return this.getEscolaridade().getFormacao();
    }

    public String getCidadeNascimentoProfessor () {
        return this.getCidadeNascimentoPessoa();
    }

    public String getTipoEnsinoContratadoParaLecionar () {
        return this.contratacao.getNomeTipoEnsino();
    }

    public String getDiretorProfessor () {
        return this.contratacao.getDiretorEscola();
    }

    public String getCoordenadorProfessor () {
        return this.contratacao.getNomeCoordenadorCurso();
    }
}
