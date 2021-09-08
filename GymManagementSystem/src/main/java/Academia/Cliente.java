package Academia;

public class Cliente extends Pessoa {

    private PlanoExercicio planoExercicio;
    private Entrada mensalidade;
    private PersonalTrainer treinador;

    public Cliente(String nome, String cpf, String email, String telefone, String logradouro, int numero, String complemento, String bairro, String cidade, String uf, String cep, PersonalTrainer treinador, Entrada mensalidade, PlanoExercicio planoExercicio) {
        super(nome, cpf, email, telefone, logradouro, numero, complemento, bairro, cidade, uf, cep);
        if (planoExercicio == null) {
            throw new IllegalArgumentException("Plano de exercício obrigatório");
        }
        if (mensalidade == null) {
            throw new IllegalArgumentException("Mensalidade obrigatória");
        }
        if (treinador == null) {
            throw new IllegalArgumentException("Treinador obrigatório");
        }
        this.planoExercicio = planoExercicio;
        this.mensalidade = mensalidade;
        this.treinador = treinador;
        treinador.adicionarAluno(this);
    }

    public PersonalTrainer getTreinador() {
        return treinador;
    }

    public void setTreinador(PersonalTrainer treinador) {
        if(treinador == null) {
            throw new IllegalArgumentException("Treinador obrigatório");
        }
        if (this.treinador != treinador) {
            PersonalTrainer personalTrainerAnterior = this.treinador;
            this.treinador = treinador;
            personalTrainerAnterior.mudarTreinadorAluno(this, treinador);
        }
    }

    public String getHorarioPlanoExercicio() {
        return this.planoExercicio.getHorario();
    }

    public String getNomeTreinador() {
        return this.treinador.getNome();
    }
}
