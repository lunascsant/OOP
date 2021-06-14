import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNome("Luciana");
        assertEquals("Luciana", funcionarioHorista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNumDias(30);
        funcionarioHorista.setNumHorasDia(4);
        funcionarioHorista.setValorHora(10f);
        assertEquals(1200f, funcionarioHorista.calcularSalario());
    }
}