package Academia;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FluxoCaixaTest {

    @Test
    void deveCalcularFluxoCaixaMensal() {
        Entrada entrada1 = new Entrada("27/05/2021", 69.99f, "Pix", "Alana Barros - mensalidade");
        Entrada entrada2 = new Entrada("27/05/2021", 69.99f, "Dinheiro", "Luciana Nascimento - mensalidade");

        List<Entrada> entradas = new ArrayList<Entrada>();
        List<Saida> saidas = new ArrayList<Saida>();

        entradas.add(entrada1);
        entradas.add(entrada2);

        assertEquals(139.98f, FluxoCaixa.calculaFluxoCaixaMensal(entradas, saidas));
    }

    @Test
    void deveCalcularFluxoCaixaMensalValorNegativo() {
        Entrada entrada1 = new Entrada("27/05/2021", 69.99f, "Pix", "Alana Barros - mensalidade");
        Entrada entrada2 = new Entrada("27/05/2021", 69.99f, "Dinheiro", "Luciana Nascimento - mensalidade");

        Saida saida1 = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        Saida saida2 = new Saida("27/05/2021", 1500.0f, "TED", "João Silva - salário");

        List<Entrada> entradas = new ArrayList<Entrada>();
        List<Saida> saidas = new ArrayList<Saida>();

        entradas.add(entrada1);
        entradas.add(entrada2);
        saidas.add(saida1);
        saidas.add(saida2);

        assertEquals(-3360.02f, FluxoCaixa.calculaFluxoCaixaMensal(entradas, saidas));
    }

    @Test
    void deveRetornarListaEntradasNecessaria() {
        try {
            Saida saida1 = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
            Saida saida2 = new Saida("27/05/2021", 1500.0f, "TED", "João Silva - salário");

            List<Saida> saidas = new ArrayList<Saida>();

            saidas.add(saida1);
            saidas.add(saida2);

            FluxoCaixa.calculaFluxoCaixaMensal(null, saidas);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("É necessário receber uma lista de entradas, mesmo que vazia.", e.getMessage());
        }
    }

    @Test
    void deveRetornarListaSaidasNecessaria() {
        try {
            Entrada entrada1 = new Entrada("27/05/2021", 69.99f, "Pix", "Alana Barros - mensalidade");
            Entrada entrada2 = new Entrada("27/05/2021", 69.99f, "Dinheiro", "Luciana Nascimento - mensalidade");

            List<Entrada> entradas = new ArrayList<Entrada>();

            entradas.add(entrada1);
            entradas.add(entrada2);

            FluxoCaixa.calculaFluxoCaixaMensal(entradas, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("É necessário receber uma lista de saídas, mesmo que vazia.", e.getMessage());
        }
    }
}