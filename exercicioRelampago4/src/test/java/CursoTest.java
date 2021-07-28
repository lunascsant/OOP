import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomesProfessoresLecionamAlgumaTurma() {
        Professor professor1 = new Professor("Marco");
        Professor professor2 = new Professor("Antonio");

        Turma turma1 = new Turma();
        turma1.setProfessor(professor1);
        Turma turma2 = new Turma();
        turma2.setProfessor(professor2);

        Curso curso = new Curso();
        curso.cadastraTurma(turma1);
        curso.cadastraTurma(turma2);

        List<String> lista = Arrays.asList("Marco", "Antonio");

        assertEquals(lista, curso.getNomesProfessoresLecionamAlgumaTurma());
    }

    @Test
    void deveRetornarNomeProfessorLecionaTurma() {
        Professor professor1 = new Professor("Marco");

        Turma turma1 = new Turma();
        turma1.setProfessor(professor1);

        Curso curso = new Curso();
        curso.cadastraTurma(turma1);

        List<String> lista = Arrays.asList("Marco");

        assertEquals(lista, curso.getNomesProfessoresLecionamAlgumaTurma());
    }

    @Test
    void deveRetornarListaVazia() {
        Curso curso = new Curso();

        assertEquals(new ArrayList<String>(), curso.getNomesProfessoresLecionamAlgumaTurma());
    }

    @Test
    void deveRetornarListaComTamanhoZero() {
        Curso curso = new Curso();

        assertEquals(0, curso.getNomesProfessoresLecionamAlgumaTurma().size());
    }
}