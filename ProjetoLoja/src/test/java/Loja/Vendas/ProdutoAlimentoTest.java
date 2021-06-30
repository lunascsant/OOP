package Loja.Vendas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    ProdutoAlimento produtoAlimento;

    @BeforeEach
    void setUp () {
        produtoAlimento = new ProdutoAlimento();
        produtoAlimento.setId("123");
        produtoAlimento.setFabricante("Albaruska");
        produtoAlimento.setNome("Arroz agulhinha");
        produtoAlimento.setDescricao("Arroz tipo agulhinha 100% grãos nobres");
        produtoAlimento.setPreco(18.0f);
        produtoAlimento.setEstaDisponivel(true);
        produtoAlimento.setQuantidade(500);
        produtoAlimento.setDataValidade("05/10/2023");
        produtoAlimento.setDataFabricacao("05/10/2020");
        List<String> ingredientesArroz = new ArrayList<String>();
        ingredientesArroz.add("Grãos de arroz");
        produtoAlimento.setIngredientes(ingredientesArroz);
        produtoAlimento.setEhLiquido(false);
        produtoAlimento.setPeso(5.0f);

    }

    @Test
    void deveRetornarId() {
        assertEquals("123", produtoAlimento.getId());
    }

    @Test
    void deveRetornarFabricante() {
        assertEquals("Albaruska", produtoAlimento.getFabricante());
    }

    @Test
    void deveRetornarNome() {
        assertEquals("Arroz agulhinha", produtoAlimento.getNome());
    }

    @Test
    void deveRetornarDescricao() {
        assertEquals("Arroz tipo agulhinha 100% grãos nobres", produtoAlimento.getDescricao());
    }

    @Test
    void deveRetornarPreco() {
        assertEquals(18.0f, produtoAlimento.getPreco());
    }

    @Test
    void deveRetornarEstaDisponivel() {
        assertEquals(true, produtoAlimento.estaDisponivel());
    }

    @Test
    void deveRetornarQuantidade() {
        assertEquals(500, produtoAlimento.getQuantidade());
    }

    @Test
    void deveRetornarEhLiquido() {
        assertEquals(false, produtoAlimento.ehLiquido());
    }

    @Test
    void deveRetornarDataValidade() {
        assertEquals( "05/10/2023", produtoAlimento.getDataValidade());
    }

    @Test
    void deveRetornarDataFabricacao() {
        assertEquals( "05/10/2020", produtoAlimento.getDataFabricacao());
    }

    @Test
    void deveRetornarPeso() {
        assertEquals( 5.0f, produtoAlimento.getPeso());
    }
}