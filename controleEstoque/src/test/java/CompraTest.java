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

    @Test
    void deveRetornarTrueMetodoComprar() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("João", "123");
        Compra compra = new Compra("26/01/2020", produto, fornecedor, 1, 1.90f);

        assertEquals(true, compra.comprar(produto, 1));
    }

    @Test
    void deveRetornarFalseMetodoComprar() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("João", "123");
        Compra compra = new Compra("26/01/2020", produto, fornecedor, 41, 1.90f);

        assertEquals(false, compra.comprar(produto, 41));
    }
}