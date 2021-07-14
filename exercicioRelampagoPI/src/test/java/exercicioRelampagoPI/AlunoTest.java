package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno() {
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade("Juiz de Fora");
        Estado estado = new Estado("Minas Gerais");
        cidade.setEstado(estado);
        aluno.setNaturalidade(cidade);

        assertEquals("Minas Gerais", aluno.getEstadoNaturalidadeAluno());
    }

    @Test
    void deveRetornarQualEstadoAlunoEstuda() {
        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Escola escola = new Escola();
        Cidade cidade = new Cidade("São Paulo");
        Estado estado = new Estado("São Paulo");
        cidade.setEstado(estado);
        escola.setCidade(cidade);
        curso.setEscola(escola);
        aluno.setCurso(curso);

        assertEquals("São Paulo", aluno.getEstadoAlunoEstuda());
    }

    @Test
    void deveRetornarNomeCoordenadorCursoAluno() {
        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Professor professor = new Professor("Marco Antônio");
        curso.setCoordenacao(professor);
        aluno.setCurso(curso);

        assertEquals("Marco Antônio", aluno.getCoordenadorCursoAluno());
    }
}