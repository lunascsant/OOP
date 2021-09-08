package Academia;

import java.util.ArrayList;
import java.util.List;

public class Equipamento {

    private String nome;
    private List<PlanoExercicio> planosEnvolvido;

    public Equipamento (String nome) {
        this.nome = nome;
        this.planosEnvolvido = new ArrayList<PlanoExercicio>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void alocar (PlanoExercicio planoExercicio) {
        if(planoExercicio == null) {
            throw new NullPointerException("Plano de exercício deve ser informado.");
        }
        if (!verificarPlanoEnvolvido(planoExercicio)) {
            this.planosEnvolvido.add(planoExercicio);
        }
        if (!planoExercicio.verificarUsoEquipamento(this)) {
            planoExercicio.registrarEquipamento(this);
        }
    }

    public void sairPlanoExercicio(PlanoExercicio planoExercicio) {
        if (planoExercicio == null) {
            throw new NullPointerException("Plano de exercício deve ser informado.");
        }
        if (verificarPlanoEnvolvido(planoExercicio)) {
            this.planosEnvolvido.remove(planoExercicio);
        }
        if (planoExercicio.verificarUsoEquipamento(this)) {
            planoExercicio.removerUsoEquipamento(this);
        }
    }

    public boolean verificarPlanoEnvolvido(PlanoExercicio planoExercicio) {
        return this.planosEnvolvido.contains(planoExercicio);
    }

}
