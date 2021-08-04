import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    @Test
    void deveRetornarExcecaoClienteObrigatorio() {
        try {
            Produto produto = new Produto("Produto10", 10, 1.25f, 5, 20);
            Venda venda = new Venda("01/05/78", produto, null, 12);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cliente obrigatório", e.getMessage());
        }
    }
}