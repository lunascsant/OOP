package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeCoordenadorCurso() {
        Professor professor = new Professor("Marco Antônio");
        Escolaridade escolaridadeProfessor = new Escolaridade("Mestrado");
        professor.setEscolaridade(escolaridadeProfessor);

        Curso curso = new Curso();
        curso.setCoordenacao(professor);

        assertEquals("Mestrado", curso.getEscolaridadeCoordenador());
    }
}