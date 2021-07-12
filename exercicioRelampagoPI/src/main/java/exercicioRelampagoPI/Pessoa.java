package exercicioRelampagoPI;

public class Pessoa {
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstadoCidade() {
        return this.naturalidade.getNomeEstado();
    }

    public String getCidadeNascimentoPessoa() {
        return this.naturalidade.getNomeCidade();
    }
}
