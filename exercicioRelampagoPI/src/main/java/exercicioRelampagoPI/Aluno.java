package exercicioRelampagoPI;

public class Aluno extends Pessoa {

    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstadoNaturalidadeAluno () {
        return this.getEstadoCidade();
    }

    public String getEstadoAlunoEstuda () {
        return this.curso.getNomeEstadoEscolaCurso();
    }

    public String getCoordenadorCursoAluno () {
        return this.curso.getNomeCoordenadorCurso();
    }
}
