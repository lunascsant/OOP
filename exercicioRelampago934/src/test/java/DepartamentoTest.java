import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarNomePaisSedeGrupoEmpresa() {
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo();
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento(empresa);

        empresa.setGrupo(grupo);
        grupo.setSede(pais);

        assertEquals("Brasil", departamento.getNomePaisSedeGrupoEmpresa());
    }

    @Test
    void deveRetornarExcecaoDepartamentoSemChefe() {
        try {
            Empresa empresa = new Empresa();
            Departamento departamento = new Departamento(empresa);

            departamento.getEscolaridadeChefeDepartamento();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Departamento sem chefe", e.getMessage());
        }

    }

    @Test
    void deveRetornarEscolaridadeChefeDepartamento() {
        Escolaridade escolaridade = new Escolaridade("Ensino Médio");
        Funcionario chefe = new Funcionario();
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento(empresa);

        departamento.setChefe(chefe);
        chefe.setEscolaridade(escolaridade);

        assertEquals("Ensino Médio", departamento.getEscolaridadeChefeDepartamento());
    }
}