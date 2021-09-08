package Academia;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {

    @Test
    void deveRetornarFalseVerificarDisponibilidade() {
        Agenda agenda = new Agenda();
        agenda.marcarAgendamento("Segunda 14h");

        assertFalse(agenda.verificarDisponibilidade("Segunda 14h"));
    }

    @Test
    void deveRetornarTrueVerificarDisponibilidade() {
        Agenda agenda = new Agenda();

        assertTrue(agenda.verificarDisponibilidade("Segunda 14h"));
    }

    @Test
    void deveMarcarAgendamento() {
        Agenda agenda = new Agenda();
        agenda.marcarAgendamento("Sexta 14h");

        List<String> agendamentos = new ArrayList<String>();
        agendamentos.add("Sexta 14h");
        assertEquals(agendamentos, agenda.getAgendamentos());
    }

    @Test
    void deveRetornarExcecaoHorarioInexistenteMarcarAgendamento() {
        try {
            Agenda agenda = new Agenda();
            agenda.marcarAgendamento("Sábado 14h");

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Horário indisponível ou não existente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoHorarioIndisponivelMarcarAgendamento() {
        try {
            Agenda agenda = new Agenda();
            agenda.marcarAgendamento("Sexta 14h");
            agenda.marcarAgendamento("Sexta 14h");

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Horário indisponível ou não existente", e.getMessage());
        }
    }


    @Test
    void deveDesmarcarAgendamento() {
        Agenda agenda = new Agenda();
        agenda.marcarAgendamento("Terça 14h");
        agenda.marcarAgendamento("Quarta 14h");
        agenda.desmarcarAgendamento("Terça 14h");

        List<String> agendamentos = new ArrayList<String>();
        agendamentos.add("Quarta 14h");
        assertEquals(agendamentos, agenda.getAgendamentos());
    }

    @Test
    void deveRetornarExcecaoImpossivelDesmarcarAgendamento() {
        try {
            Agenda agenda = new Agenda();
            agenda.desmarcarAgendamento("Sexta 14h");

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é possível desmarcar um horário não agendado", e.getMessage());
        }
    }
}