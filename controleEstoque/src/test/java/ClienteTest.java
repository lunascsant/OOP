import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarExcecaoCpfObrigatorio() {
        try {
            Cliente cliente = new Cliente("João", null);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf obrigatório", e.getMessage());
        }
    }

}