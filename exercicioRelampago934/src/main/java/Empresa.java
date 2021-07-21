public class Empresa {

    private Grupo grupo;
    private Funcionario diretor;

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomePaisSedeGrupo () {
        if (grupo == null) {
            throw new NullPointerException("Empresa sem grupo");
        }
        return grupo.getNomePaisSede();
    }

    public String getNomeDiretor () {
        if (diretor == null) {
            throw new NullPointerException("Empresa sem diretor");
        }
        return diretor.getNomeFuncionario();
    }
}
