import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacao() {
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo();
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento(empresa);
        Funcionario funcionario = new Funcionario();

        funcionario.setAlocacao(departamento);
        empresa.setGrupo(grupo);
        grupo.setSede(pais);

        assertEquals("Brasil", funcionario.getPaisAlocacao());
    }

    @Test
    void deveRetornarEstadoFilialCoordenada() {
        Estado estado = new Estado("Minas Gerais");
        Empresa empresa = new Empresa();
        Cidade cidade = new Cidade(estado);
        Filial filial = new Filial(cidade, empresa);
        Funcionario funcionario = new Funcionario();

        funcionario.setCoordenacao(filial);

        assertEquals("Minas Gerais", funcionario.getEstadoFilialCoordenada());
    }

    @Test
    void deveRetornarExcecaoFuncionarioSemAlocacao() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.getPaisAlocacao();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Funcionário sem alocação", e.getMessage());
        }

    }

    @Test
    void deveRetornarExcecaoFuncionarioNaoCoordenaNenhumaFilial() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.getEstadoFilialCoordenada();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Funcionário não coordena nenhuma filial", e.getMessage());
        }

    }
}