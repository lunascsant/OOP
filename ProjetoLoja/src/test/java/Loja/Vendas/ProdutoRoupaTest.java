package Loja.Vendas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {
    ProdutoRoupa produtoRoupa;

    @BeforeEach
    void setUp() {
        produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setId("589");
        produtoRoupa.setFabricante("Hering");
        produtoRoupa.setNome("Blusa de frio");
        produtoRoupa.setDescricao("Manga comprida tecido em camurça");
        produtoRoupa.setPreco(200.0f);
        produtoRoupa.setEstaDisponivel(true);
        produtoRoupa.setQuantidade(400);
        produtoRoupa.setTamanho("GG");
        produtoRoupa.setMaterialTecido("Camurça");
    }

    @Test
    void deveRetornarId() {
        assertEquals("589", produtoRoupa.getId());
    }

    @Test
    void deveRetornarFabricante() {
        assertEquals("Hering", produtoRoupa.getFabricante());
    }

    @Test
    void deveRetornarNome() {
        assertEquals("Blusa de frio", produtoRoupa.getNome());
    }

    @Test
    void deveRetornarDescricao() {
        assertEquals("Manga comprida tecido em camurça", produtoRoupa.getDescricao());
    }

    @Test
    void deveRetornarPreco() {
        assertEquals(200.0f, produtoRoupa.getPreco());
    }

    @Test
    void deveRetornarEstaDisponivel() {
        assertEquals(true, produtoRoupa.estaDisponivel());
    }

    @Test
    void deveRetornarQuantidade() {
        assertEquals(400, produtoRoupa.getQuantidade());
    }

    @Test
    void getTamanho() {
        assertEquals("GG", produtoRoupa.getTamanho());
    }

    @Test
    void getMaterialTecido() {
        assertEquals("Camurça", produtoRoupa.getMaterialTecido());
    }
}