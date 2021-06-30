package Loja.Vendas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLimpezaTest {
    ProdutoLimpeza produtoLimpeza;

    @BeforeEach
    void setUp() {
        produtoLimpeza = new ProdutoLimpeza();
        produtoLimpeza.setId("235");
        produtoLimpeza.setFabricante("Veja");
        produtoLimpeza.setNome("Limpa Vidro");
        produtoLimpeza.setDescricao("Limpa Vidro que limpa e remove as sujeiras mais difíceis");
        produtoLimpeza.setPreco(7.0f);
        produtoLimpeza.setEstaDisponivel(true);
        produtoLimpeza.setQuantidade(200);
        produtoLimpeza.setAroma("Lavanda");
        produtoLimpeza.setEhToxico(true);
        produtoLimpeza.setVolume(250);
    }

    @Test
    void deveRetornarId() {
        assertEquals("235", produtoLimpeza.getId());
    }

    @Test
    void deveRetornarFabricante() {
        assertEquals("Veja", produtoLimpeza.getFabricante());
    }

    @Test
    void deveRetornarNome() {
        assertEquals("Limpa Vidro", produtoLimpeza.getNome());
    }

    @Test
    void deveRetornarDescricao() {
        assertEquals("Limpa Vidro que limpa e remove as sujeiras mais difíceis", produtoLimpeza.getDescricao());
    }

    @Test
    void deveRetornarPreco() {
        assertEquals(7.0f, produtoLimpeza.getPreco());
    }

    @Test
    void deveRetornarEstaDisponivel() {
        assertEquals(true, produtoLimpeza.estaDisponivel());
    }

    @Test
    void deveRetornarQuantidade() {
        assertEquals(200, produtoLimpeza.getQuantidade());
    }

    @Test
    void deveRetornarVolume() {
        assertEquals(250.0f, produtoLimpeza.getVolume());
    }

    @Test
    void deveRetornarAroma() {
        assertEquals("Lavanda", produtoLimpeza.getAroma());
    }

    @Test
    void deveRetornarEhToxico() {
        assertEquals(true, produtoLimpeza.ehToxico());
    }
}