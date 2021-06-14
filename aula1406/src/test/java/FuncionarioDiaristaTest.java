import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void deveCalcularSalario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setNumDias(300);
        funcionarioDiarista.setValorDia(10f);
        assertEquals(3000f, funcionarioDiarista.calcularSalario());
    }
}