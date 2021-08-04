import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveRetornarExcecaoNomeObrigatorio() {
        try {
            Produto produto = new Produto(null, 12, 12.90f, 4, 18);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome obrigatório", e.getMessage());
        }
    }
}