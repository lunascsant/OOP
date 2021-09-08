package Academia;

import java.util.ArrayList;
import java.util.List;

public class PersonalTrainer extends Pessoa {

    private Agenda agenda;
    private Saida salario;
    private List<Cliente> alunos;

    public PersonalTrainer(String nome, String cpf, String email, String telefone, String logradouro, int numero,
                           String complemento, String bairro, String cidade, String uf, String cep, Saida salario) {
        super(nome, cpf, email, telefone, logradouro, numero, complemento, bairro, cidade, uf, cep);
        this.alunos = new ArrayList<Cliente>();
        this.agenda = new Agenda();
        if (salario == null) {
            throw new IllegalArgumentException("Salário obrigatório");
        }
        this.salario = salario;
    }


    public void adicionarAluno(Cliente aluno) {
        if (!verificarSePossuiAluno(aluno)){
            String horario = aluno.getHorarioPlanoExercicio();
            if (agenda.verificarDisponibilidade(horario)) {
                this.agenda.marcarAgendamento(horario);
                this.alunos.add(aluno);
                aluno.setTreinador(this);
            } else {
                throw new IllegalArgumentException("Aluno com plano de exercício com horário inviável.");
            }
        }
    }

    public void mudarTreinadorAluno(Cliente aluno, PersonalTrainer treinadorNovo) {
        String horario = aluno.getHorarioPlanoExercicio();
        if (verificarSePossuiAluno(aluno)) {
            this.alunos.remove(aluno);
            this.agenda.desmarcarAgendamento(horario);
        }
        treinadorNovo.adicionarAluno(aluno);
    }

    public boolean verificarSePossuiAluno(Cliente aluno) {
        return this.alunos.contains(aluno);
    }
}
