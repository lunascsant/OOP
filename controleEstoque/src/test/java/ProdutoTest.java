import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void deveRetornarExcecaoTransacaoObrigatoria() {
        try {
            Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
            produto.registrarHistorico(null);

            fail();
        } catch (NullPointerException e) {
            assertEquals("Transação obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarHistoricoPreenchidoUmItem() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.registrarHistorico("Compra do produto Caneta em 26/01/2020, total de 5 unidades");

        List lista = new ArrayList<String>();
        lista.add("Compra do produto Caneta em 26/01/2020, total de 5 unidades");

        assertEquals(lista, produto.getHistorico());
    }

    @Test
    void deveRetornarHistoricoPreenchidoVariosItens() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.registrarHistorico("Compra do produto Caneta em 26/01/2020, total de 5 unidades");
        produto.registrarHistorico("Venda do produto Caneta em 26/01/2020, total de 8 unidades");

        List lista = new ArrayList<String>();
        lista.add("Compra do produto Caneta em 26/01/2020, total de 5 unidades");
        lista.add("Venda do produto Caneta em 26/01/2020, total de 8 unidades");

        assertEquals(lista, produto.getHistorico());
    }

    @Test
    void deveRetornarStringHistoricoVazio() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);

        assertEquals("", produto.exibirHistorico());
    }

    @Test
    void deveRetornarStringHistoricoPreenchidoUmItem() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.registrarHistorico("Compra do produto Caneta em 26/01/2020, total de 5 unidades");


        assertEquals("Compra do produto Caneta em 26/01/2020, total de 5 unidades", produto.exibirHistorico());
    }

    @Test
    void deveRetornarStringHistoricoPreenchidoVariosItens() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.registrarHistorico("Compra do produto Caneta em 26/01/2020, total de 5 unidades");
        produto.registrarHistorico("Venda do produto Caneta em 26/01/2020, total de 8 unidades");

        assertEquals("Compra do produto Caneta em 26/01/2020, total de 5 unidades\nVenda do produto Caneta em 26/01/2020, total de 8 unidades", produto.exibirHistorico());
    }

    @Test
    void deveRetornarQtdeEstoqueAposDebitar() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.debitarEstoque(2);

        assertEquals(8, produto.getQtdeEstoque());
    }

    @Test
    void deveRetornarQtdeEstoqueAposCreditar() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.creditarEstoque(2);

        assertEquals(12, produto.getQtdeEstoque());
    }

    @Test
    void deveRetornarTrueEstoqueBaixo() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.debitarEstoque(6);

        assertEquals(true, produto.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarFalseEstoqueBaixo() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        produto.debitarEstoque(5);

        assertEquals(false, produto.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarTrueEstoqueInsuficiente() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);

        assertEquals(true, produto.verificarEstoqueInsuficiente(11));
    }

    @Test
    void deveRetornarFalseEstoqueInsuficiente() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);

        assertEquals(false, produto.verificarEstoqueInsuficiente(10));
    }

    @Test
    void deveRetornarTrueEstoqueExcedente() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);

        assertEquals(true, produto.verificarEstoqueExcedente(41));
    }

    @Test
    void deveRetornarFalseEstoqueExcedente() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);

        assertEquals(false, produto.verificarEstoqueExcedente(1));
    }

    @Test
    void deveCalcularValorVenda() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);

        assertEquals(3.80f, produto.calcularValorVenda(2));
    }

    @Test
    void deveVenderRegistrarHistorico() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Cliente cliente = new Cliente("João", "123");
        produto.vender("26/01/2020", cliente, 2);
        assertEquals("Valor venda = 3.8\nVenda do produto Caneta em 26/01/2020, total de 2 unidades", produto.exibirHistorico());
    }

    @Test
    void deveRegistrarEstoqueInsuficienteHistorico() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Cliente cliente = new Cliente("João", "123");
        produto.vender("26/01/2020", cliente, 11);
        assertEquals("Estoque insuficiente", produto.exibirHistorico());
    }

    @Test
    void deveRegistrarEstoqueBaixoHistorico() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Cliente cliente = new Cliente("João", "123");
        produto.vender("26/01/2020", cliente, 9);
        assertEquals("Valor venda = 17.1\nEstoque baixo\nVenda do produto Caneta em 26/01/2020, total de 9 unidades", produto.exibirHistorico());
    }

    @Test
    void deveComprarRegistrarHistorico() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("João", "123");
        produto.comprar("26/01/2020", fornecedor, 2, 1.0f);
        assertEquals("Compra do produto Caneta em 26/01/2020, total de 2 unidades", produto.exibirHistorico());
    }

    @Test
    void deveRegistrarEstoqueExcedenteHistorico() {
        Produto produto = new Produto("Caneta", 10, 1.90f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("João", "123");
        produto.comprar("26/01/2020", fornecedor, 41, 1.0f);
        assertEquals("Estoque excedente", produto.exibirHistorico());
    }
}