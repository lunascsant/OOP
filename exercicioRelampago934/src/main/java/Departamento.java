public class Departamento {

    private Empresa empresa;
    private Funcionario chefe;

    public Departamento (Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getNomePaisSedeGrupoEmpresa () {
        return empresa.getNomePaisSedeGrupo();
    }

    public String getEscolaridadeChefeDepartamento () {
        if (chefe == null) {
            throw new NullPointerException("Departamento sem chefe");
        }
        return chefe.getDescricaoEscolaridade();
    }
}
