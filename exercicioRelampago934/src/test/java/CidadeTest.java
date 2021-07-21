import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void getNomeEstadoPertencente() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade(estado);

        assertEquals("São Paulo", cidade.getNomeEstadoPertencente());
    }

}