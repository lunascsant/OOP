package Academia;

import java.util.ArrayList;
import java.util.List;

public class PlanoExercicio {

    private String horario;
    private String exercicios;
    private List<Equipamento> equipamentosUsados;

    public PlanoExercicio (String horario, String exercicios) {
        this.equipamentosUsados = new ArrayList<Equipamento>();
        this.exercicios = exercicios;
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void registrarEquipamento(Equipamento equipamento) {
        if (equipamento == null) {
            throw new NullPointerException("Equipamento deve ser informado");
        }
        if (!verificarUsoEquipamento(equipamento)) {
            this.equipamentosUsados.add(equipamento);
        }
        if (!equipamento.verificarPlanoEnvolvido(this)) {
            equipamento.alocar(this);
        }
    }

    public void removerUsoEquipamento(Equipamento equipamento) {
        if (equipamento == null) {
            throw new NullPointerException("Equipamento deve ser informado");
        }
        if (verificarUsoEquipamento(equipamento)) {
            this.equipamentosUsados.remove(equipamento);
        }
        if (equipamento.verificarPlanoEnvolvido(this)) {
            equipamento.sairPlanoExercicio(this);
        }
    }

    public boolean verificarUsoEquipamento(Equipamento equipamento) {
        return this.equipamentosUsados.contains(equipamento);
    }
}
