import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {
    @Test
    void deveRetornarExcecaoFornecedorObrigatorio() {
        try {
            Produto produto = new Produto("Produto10", 10, 1.25f, 5, 20);
            Compra compra = new Compra("25/12/2020", produto, null, 5, 1.25f);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fornecedor obrigatório", e.getMessage());
        }
    }
}