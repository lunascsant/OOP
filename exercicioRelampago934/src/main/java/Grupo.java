public class Grupo {

    private Pais sede;
    private Funcionario presidente;

    public Grupo (Funcionario presidente) {
        this.presidente = presidente;
    }

    public Grupo () {

    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getEscolaridadePresidente () {
        if (presidente == null) {
            throw new NullPointerException("Grupo sem presidente");
        }
        return presidente.getDescricaoEscolaridade();
    }

    public String getNomePaisSede () {
        if (sede == null) {
            throw new NullPointerException("Grupo sem sede");
        }
        return sede.getNomePais();
    }
}
