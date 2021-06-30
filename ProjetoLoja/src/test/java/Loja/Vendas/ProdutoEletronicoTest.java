package Loja.Vendas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    ProdutoEletronico produtoEletronico;

    @BeforeEach
    void setUp() {
        produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setId("839");
        produtoEletronico.setFabricante("JBL");
        produtoEletronico.setNome("Caixinha de som");
        produtoEletronico.setDescricao("Oferece um som natural com grande clareza e precisão");
        produtoEletronico.setPreco(150.0f);
        produtoEletronico.setEstaDisponivel(true);
        produtoEletronico.setQuantidade(100);
        produtoEletronico.setCor("Preto");
        produtoEletronico.setUsaPilha(false);
        produtoEletronico.setTemBateria(true);
        produtoEletronico.setTecnologiaConexao("Bluetooth");
    }

    @Test
    void deveRetornarId() {
        assertEquals("839", produtoEletronico.getId());
    }

    @Test
    void deveRetornarFabricante() {
        assertEquals("JBL", produtoEletronico.getFabricante());
    }

    @Test
    void deveRetornarNome() {
        assertEquals("Caixinha de som", produtoEletronico.getNome());
    }

    @Test
    void deveRetornarDescricao() {
        assertEquals("Oferece um som natural com grande clareza e precisão", produtoEletronico.getDescricao());
    }

    @Test
    void deveRetornarPreco() {
        assertEquals(150.0f, produtoEletronico.getPreco());
    }

    @Test
    void deveRetornarEstaDisponivel() {
        assertEquals(true, produtoEletronico.estaDisponivel());
    }

    @Test
    void deveRetornarQuantidade() {
        assertEquals(100, produtoEletronico.getQuantidade());
    }

    @Test
    void deveRetornarTecnologiaConexao() {
        assertEquals("Bluetooth", produtoEletronico.getTecnologiaConexao());
    }

    @Test
    void deveRetornarCor() {
        assertEquals("Preto", produtoEletronico.getCor());
    }

    @Test
    void deveRetornarUsaPilha() {
        assertEquals(false, produtoEletronico.usaPilha());
    }

    @Test
    void deveRetornarTemBateria() {
        assertEquals(true, produtoEletronico.temBateria());
    }
}