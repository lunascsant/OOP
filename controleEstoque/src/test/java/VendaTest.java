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

    @Test
    void deveRetornarExcecaoQuantidadePositivaObrigatoria() {
        try {
            Produto produto = new Produto("Produto10", 10, 1.25f, 5, 20);
            Cliente cliente = new Cliente("João", "123");
            Venda venda = new Venda("01/05/78", produto, cliente, 12);

            venda.vender(produto, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade positiva obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarTrueMetodoVender() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Cliente cliente = new Cliente("João", "123");
        Venda venda = new Venda("26/01/2020", produto, cliente, 5);

        assertEquals(true, venda.vender(produto, 1));
    }

    @Test
    void deveRetornarFalseMetodoVender() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Cliente cliente = new Cliente("João", "123");
        Venda venda = new Venda("26/01/2020", produto, cliente, 6);

        assertEquals(false, venda.vender(produto, 11));
    }
}