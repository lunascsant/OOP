package exRelampago;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    AlunoGraduacao alunoGraduacao;
    @BeforeEach
    void setUp() {
        alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNome("Luciana");
        alunoGraduacao.setMatricula("202065566C");
    }


    @Test
    void deveRetornarFalseAprovacao() {
        alunoGraduacao.setNotaAvaliacao1(6.0f);
        alunoGraduacao.setNotaAvaliacao2(7.8f);
        assertEquals(false, alunoGraduacao.verificaAprovacao());
    }

    @Test
    void deveRetornarTrueAprovacao() {
        alunoGraduacao.setNotaAvaliacao1(6.0f);
        alunoGraduacao.setNotaAvaliacao2(8.0f);
        assertEquals(true, alunoGraduacao.verificaAprovacao());
    }

    @Test
    void deveRetornarNome() {
        assertEquals("Luciana", alunoGraduacao.getNome());
    }

    @Test
    void deveRetornarMatricula() {
        assertEquals("202065566C", alunoGraduacao.getMatricula());
    }
}