import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarNomePaisSede() {
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo();

        grupo.setSede(pais);

        assertEquals("Brasil", grupo.getNomePaisSede());
    }

    @Test
    void deveRetornarEscolaridadePresidente() {
        Funcionario presidente = new Funcionario();
        Escolaridade escolaridade = new Escolaridade("Ensino Superior Completo");
        presidente.setEscolaridade(escolaridade);
        Grupo grupo = new Grupo(presidente);

        assertEquals("Ensino Superior Completo", grupo.getEscolaridadePresidente());
    }

    @Test
    void deveRetornarExcecaoGrupoSemPresidente() {
        try {
            Grupo grupo = new Grupo();
            grupo.getEscolaridadePresidente();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Grupo sem presidente", e.getMessage());
        }

    }

    @Test
    void deveRetornarExcecaoGrupoSemSede() {
        try {
            Grupo grupo = new Grupo();
            grupo.getNomePaisSede();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Grupo sem sede", e.getMessage());
        }

    }
}