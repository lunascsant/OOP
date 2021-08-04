public class Pessoa {
    private String nome;

    public Pessoa (String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        this.nome = nome;
    }
}
