package exercicioRelampagoPI;

public class Cidade {

    private String nomeCidade;
    private Estado estado;

    public Cidade (String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeEstado() {
        return this.estado.getNomeEstado();
    }
}
