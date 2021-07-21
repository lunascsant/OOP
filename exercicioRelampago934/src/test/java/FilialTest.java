import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void getNomeEstadoCidade() {
        Estado estado = new Estado("Minas Gerais");
        Empresa empresa = new Empresa();
        Cidade cidade = new Cidade(estado);
        Filial filial = new Filial(cidade, empresa);

        assertEquals("Minas Gerais", filial.getNomeEstadoCidade());
    }

    @Test
    void getNomeDiretorEmpresa() {
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade(estado);
        Empresa empresa = new Empresa();
        Funcionario diretor = new Funcionario();
        Filial filial = new Filial(cidade, empresa);

        empresa.setDiretor(diretor);
        diretor.setNomeFuncionario("Pedro Oliveira");

        assertEquals("Pedro Oliveira", filial.getNomeDiretorEmpresa());
    }
}