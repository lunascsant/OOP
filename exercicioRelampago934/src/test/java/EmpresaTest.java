import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarNomePaisSedeGrupo() {
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo();
        Empresa empresa = new Empresa();

        empresa.setGrupo(grupo);
        grupo.setSede(pais);

        assertEquals("Brasil", empresa.getNomePaisSedeGrupo());
    }

    @Test
    void deveRetornarNomeDiretor() {
        Empresa empresa = new Empresa();
        Funcionario diretor = new Funcionario();

        empresa.setDiretor(diretor);
        diretor.setNomeFuncionario("Pedro Oliveira");

        assertEquals("Pedro Oliveira", empresa.getNomeDiretor());
    }

    @Test
    void deveRetornarExcecaoEmpresaSemDiretor() {
        try {
            Empresa empresa = new Empresa();

            empresa.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Empresa sem diretor", e.getMessage());
        }

    }

    @Test
    void deveRetornarExcecaoEmpresaSemGrupo() {
        try {
            Empresa empresa = new Empresa();

            empresa.getNomePaisSedeGrupo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Empresa sem grupo", e.getMessage());
        }

    }
}