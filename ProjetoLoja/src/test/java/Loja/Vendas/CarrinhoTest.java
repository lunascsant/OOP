package Loja.Vendas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void deveCalcularValorTotalCarrinho() {
        ProdutoAlimento sacoArroz = new ProdutoAlimento();
        sacoArroz.setId("123");
        sacoArroz.setFabricante("Albaruska");
        sacoArroz.setNome("Arroz agulhinha");
        sacoArroz.setDescricao("Arroz tipo agulhinha 100% grãos nobres");
        sacoArroz.setPreco(18.0f);
        sacoArroz.setEstaDisponivel(true);
        sacoArroz.setQuantidade(500);
        sacoArroz.setDataValidade("05/10/2023");
        sacoArroz.setDataFabricacao("05/10/2020");
        List<String> ingredientesArroz = new ArrayList<String>();
        ingredientesArroz.add("Grãos de arroz");
        sacoArroz.setIngredientes(ingredientesArroz);
        sacoArroz.setEhLiquido(false);
        sacoArroz.setPeso(5.0f);

        ProdutoLimpeza limpaVidro = new ProdutoLimpeza();
        limpaVidro.setId("235");
        limpaVidro.setFabricante("Veja");
        limpaVidro.setNome("Limpa Vidro");
        limpaVidro.setDescricao("Limpa Vidro que limpa e remove as sujeiras mais difíceis");
        limpaVidro.setPreco(7.0f);
        limpaVidro.setEstaDisponivel(true);
        limpaVidro.setQuantidade(200);
        limpaVidro.setAroma("Lavanda");
        limpaVidro.setEhToxico(true);
        limpaVidro.setVolume(250);

        ProdutoEletronico caixinhaSom = new ProdutoEletronico();
        caixinhaSom.setId("839");
        caixinhaSom.setFabricante("JBL");
        caixinhaSom.setNome("Caixinha de som");
        caixinhaSom.setDescricao("Oferece um som natural com grande clareza e precisão");
        caixinhaSom.setPreco(150.0f);
        caixinhaSom.setEstaDisponivel(true);
        caixinhaSom.setQuantidade(100);
        caixinhaSom.setCor("Preto");
        caixinhaSom.setUsaPilha(false);
        caixinhaSom.setTemBateria(true);
        caixinhaSom.setTecnologiaConexao("Bluetooth");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionaItemAoCarrinho(sacoArroz);
        carrinho.adicionaItemAoCarrinho(limpaVidro);
        carrinho.adicionaItemAoCarrinho(caixinhaSom);

        assertEquals(175.0f, carrinho.calculaValorTotalCarrinho());
    }
}