package Academia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntradaTest {

    @Test
    void deveProduzirComprovante() {
        Entrada entrada = new Entrada("27/05/2021", 69.99f, "Pix", "Alana Barros - mensalidade");
        assertEquals("Comprovante de entrada: \nValor: R$69.99\nData: 27/05/2021\nOrigem: Alana Barros - mensalidade\nMeio de transação: Pix", entrada.produzirComprovante());
    }
}