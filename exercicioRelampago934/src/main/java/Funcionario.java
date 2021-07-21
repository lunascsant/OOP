public class Funcionario {

    private String nomeFuncionario;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getDescricaoEscolaridade () {
        return escolaridade.getDescricao();
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getPaisAlocacao () {
        if (alocacao == null) {
            throw new NullPointerException("Funcionário sem alocação");
        }
        return alocacao.getNomePaisSedeGrupoEmpresa();
    }

    public String getEstadoFilialCoordenada () {
        if (coordenacao == null) {
            throw new NullPointerException("Funcionário não coordena nenhuma filial");
        }
        return coordenacao.getNomeEstadoCidade();
    }

}
