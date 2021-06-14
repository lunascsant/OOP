import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {
    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setNome("Marco");
        assertEquals("Marco", funcionarioMensalista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setValorMes(16000f);
        funcionarioMensalista.setSalarioFixo(2000f);
        assertEquals(18000f, funcionarioMensalista.calcularSalario());
    }
}