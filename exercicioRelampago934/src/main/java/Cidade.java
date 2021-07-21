public class Cidade {

    private Estado estado;

    public Cidade (Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeEstadoPertencente () {
        return estado.getNomeEstado();
    }
}
