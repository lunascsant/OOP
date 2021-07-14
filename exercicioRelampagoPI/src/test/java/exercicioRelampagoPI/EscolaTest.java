package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretorEscola() {
        Professor professor = new Professor("Marco Antônio");
        Escolaridade escolaridadeProfessor = new Escolaridade("Pós-doutorado");
        professor.setEscolaridade(escolaridadeProfessor);

        Escola escola = new Escola();
        escola.setDirecao(professor);

        assertEquals("Pós-doutorado", escola.getEscolaridadeDiretor());
    }
}