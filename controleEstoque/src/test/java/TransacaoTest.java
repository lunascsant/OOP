import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveRetornarExcecaoProdutoObrigatorio() {
        try {
            Transacao transacao = new Transacao("27/09/2021", null, 7);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Produto obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDataTransacaoObrigatorio() {
        try {
            Produto produto = new Produto("Produto 1", 12, 12.90f, 4, 18);
            Transacao transacao = new Transacao(null, produto, 5);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data da transação obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoQuantidadePositivaObrigatoria() {
        try {
            Produto produto = new Produto("Produto 1", 12, 12.90f, 4, 18);
            Transacao transacao = new Transacao("26/01/2020", produto, -1);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade positiva obrigatória", e.getMessage());
        }
    }

}