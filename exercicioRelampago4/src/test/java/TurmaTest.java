import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomesAlunos() {
        Aluno aluno1 = new Aluno("Marco");
        Aluno aluno2 = new Aluno("Antonio");
        Turma turma = new Turma();
        turma.matricular(aluno1);
        turma.matricular(aluno2);

        List<String> lista = Arrays.asList("Marco", "Antonio");

        assertEquals(lista, turma.getNomesAlunos());
    }

    @Test
    void deveRetornarNomeAluno() {
        Aluno aluno = new Aluno("Marco");
        Turma turma = new Turma();
        turma.matricular(aluno);

        List<String> lista = Arrays.asList("Marco");

        assertEquals(lista, turma.getNomesAlunos());
    }

    @Test
    void deveRetornarListaVazia() {
        Turma turma = new Turma();

        assertEquals(new ArrayList<String>(), turma.getNomesAlunos());
    }

    @Test
    void deveRetornarListaComTamanhoZero() {
        Turma turma = new Turma();

        assertEquals(0, turma.getNomesAlunos().size());
    }

    @Test
    void deveRetornarExcecaoTurmaSemProfessor() {
        try {
            Turma turma = new Turma();
            turma.getNomeProfessor();

            fail();
        } catch (NullPointerException e) {
            assertEquals("Turma sem professor", e.getMessage());
        }
    }

}