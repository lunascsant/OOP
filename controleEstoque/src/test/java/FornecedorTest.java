import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {
    @Test
    void deveRetornarExcecaoCnpjObrigatorio() {
        try {
            Fornecedor fornecedor = new Fornecedor("Fornecedor1", null);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cnpj obrigatório", e.getMessage());
        }
    }
}