package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretorEscola() {
        Professor professor = new Professor();
        Escolaridade escolaridadeProfessor = new Escolaridade();
        escolaridadeProfessor.setFormacao("Pós-doutorado");
        professor.setEscolaridade(escolaridadeProfessor);

        Escola escola = new Escola();
        escola.setDirecao(professor);

        assertEquals("Pós-doutorado", escola.getEscolaridadeDiretor());
    }
}