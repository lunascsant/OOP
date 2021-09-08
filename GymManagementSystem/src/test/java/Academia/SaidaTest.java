package Academia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaidaTest {

    @Test
    void deveProduzirComprovante() {
        Saida saida = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        assertEquals("Comprovante de saída: \nValor: R$2000.0\nData: 27/05/2021\nDestino: Julia Vieira - salário\nMeio de transação: TED", saida.produzirComprovante());
    }
}