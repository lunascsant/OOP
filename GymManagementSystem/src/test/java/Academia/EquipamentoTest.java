package Academia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipamentoTest {

    @Test
    void deveAlocarPlanoExercicio() {
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg press - Leg press 45° 20x");
        Equipamento equipamento = new Equipamento("Leg press");

        equipamento.alocar(planoExercicio);

        assertTrue(planoExercicio.verificarUsoEquipamento(equipamento));
        assertTrue(equipamento.verificarPlanoEnvolvido(planoExercicio));
    }

    @Test
    void deveDesalocarPlanoExercicio() {
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg press - Leg press 45° 20x");
        Equipamento equipamento = new Equipamento("Leg press");

        equipamento.alocar(planoExercicio);
        equipamento.sairPlanoExercicio(planoExercicio);

        assertFalse(planoExercicio.verificarUsoEquipamento(equipamento));
        assertFalse(equipamento.verificarPlanoEnvolvido(planoExercicio));
    }

    @Test
    void deveRetornarExcecaoPlanoExercicioNulo() {
        try {
            Equipamento equipamento = new Equipamento("Leg press");
            equipamento.alocar(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Plano de exercício deve ser informado.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSairPlanoExercicioNulo() {
        try {
            Equipamento equipamento = new Equipamento("Leg press");
            equipamento.sairPlanoExercicio(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Plano de exercício deve ser informado.", e.getMessage());
        }
    }
}