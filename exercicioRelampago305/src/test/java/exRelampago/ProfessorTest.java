package exRelampago;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    Professor professorMarco;

    @BeforeEach
    void setUp() {
        professorMarco = new Professor();
        professorMarco.setNome("Marco Antônio");
        professorMarco.setTitulacaoMaxima("Doutor em Engenharia de Sistemas e Computação");
    }

    @Test
    void retornaNome() {
        assertEquals("Marco Antônio", professorMarco.getNome());
    }

    @Test
    void retornaTitulacaoMaxima() {
        assertEquals("Doutor em Engenharia de Sistemas e Computação", professorMarco.getTitulacaoMaxima());
    }
}