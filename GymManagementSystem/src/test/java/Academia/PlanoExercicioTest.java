package Academia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoExercicioTest {

    @Test
    void deveRegistrarEquipamento() {
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg press - Leg press 45° 20x");
        Equipamento equipamento = new Equipamento("Leg press");

        planoExercicio.registrarEquipamento(equipamento);

        assertTrue(planoExercicio.verificarUsoEquipamento(equipamento));
        assertTrue(equipamento.verificarPlanoEnvolvido(planoExercicio));
    }

    @Test
    void deveRemoverUsoEquipamento() {
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg press - Leg press 45° 20x");
        Equipamento equipamento = new Equipamento("Leg press");

        planoExercicio.registrarEquipamento(equipamento);
        planoExercicio.removerUsoEquipamento(equipamento);

        assertFalse(planoExercicio.verificarUsoEquipamento(equipamento));
        assertFalse(equipamento.verificarPlanoEnvolvido(planoExercicio));
    }

    @Test
    void deveRetornarExcecaoRegistroEquipamentoNulo() {
        try {
            PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg press - Leg press 45° 20x");
            planoExercicio.registrarEquipamento(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Equipamento deve ser informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoRemoverEquipamentoNulo() {
        try {
            PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg press - Leg press 45° 20x");
            planoExercicio.removerUsoEquipamento(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Equipamento deve ser informado", e.getMessage());
        }
    }
}