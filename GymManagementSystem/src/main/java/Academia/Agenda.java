package Academia;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<String> agendamentos;
    private List<String> horariosDisponiveis;

    public Agenda () {
        this.agendamentos = new ArrayList<String>();
        this.horariosDisponiveis = new ArrayList<String>();

        this.horariosDisponiveis.add("Segunda 14h");
        this.horariosDisponiveis.add("Terça 14h");
        this.horariosDisponiveis.add("Quarta 14h");
        this.horariosDisponiveis.add("Quinta 14h");
        this.horariosDisponiveis.add("Sexta 14h");
        this.horariosDisponiveis.add("Segunda 16h");
        this.horariosDisponiveis.add("Terça 16h");
        this.horariosDisponiveis.add("Quarta 16h");
        this.horariosDisponiveis.add("Quinta 16h");
        this.horariosDisponiveis.add("Sexta 16h");
    }

    public boolean verificarDisponibilidade(String horario) {
        return horariosDisponiveis.contains(horario);
    }

    public void marcarAgendamento(String horario) {
        if(verificarDisponibilidade(horario)) {
            horariosDisponiveis.remove(horario);
            agendamentos.add(horario);
        } else {
            throw new IllegalArgumentException("Horário indisponível ou não existente");
        }
    }

    public void desmarcarAgendamento(String horario) {
        if(agendamentos.contains(horario)) {
            agendamentos.remove(horario);
            if (!verificarDisponibilidade(horario)) {
                horariosDisponiveis.add(horario);
            }
        } else {
            throw new IllegalArgumentException("Não é possível desmarcar um horário não agendado");
        }
    }

    public List<String> getAgendamentos() {
        return agendamentos;
    }
}
