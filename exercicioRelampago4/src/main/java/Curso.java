import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Turma> turmas;
    private List<Aluno> alunos;

    public Curso () {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public List<Turma> getTurmas () {
        return turmas;
    }

    public void setTurmas (List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Aluno> getAlunos () {
        return alunos;
    }

    public void setAlunos (List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void cadastraAluno (Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void cadastraTurma (Turma turma) {
        this.turmas.add(turma);
    }

    public List<String> getNomesProfessoresLecionamAlgumaTurma () {
        List<String> lista = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            if (turma.getProfessor() != null) {
                lista.add(turma.getNomeProfessor());
            }
        }
        return lista;
    }

}
