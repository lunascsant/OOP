package exRelampago;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    AlunoEnsinoMedio alunoEnsinoMedio;

    @BeforeEach
    void setUp() {
        alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNome("Mariana");
        alunoEnsinoMedio.setMatricula("123456789A");
    }


    @Test
    void deveRetornarFalseAprovacao() {
        alunoEnsinoMedio.setNotaAvaliacao1(6.0f);
        alunoEnsinoMedio.setNotaAvaliacao2(5.8f);
        assertEquals(false, alunoEnsinoMedio.verificaAprovacao());
    }

    @Test
    void deveRetornarTrueAprovacao() {
        alunoEnsinoMedio.setNotaAvaliacao1(6.0f);
        alunoEnsinoMedio.setNotaAvaliacao2(6.0f);
        assertEquals(true, alunoEnsinoMedio.verificaAprovacao());
    }

    @Test
    void deveRetornarNome() {
        assertEquals("Mariana", alunoEnsinoMedio.getNome());
    }

    @Test
    void deveRetornarMatricula() {
        assertEquals("123456789A", alunoEnsinoMedio.getMatricula());
    }
}