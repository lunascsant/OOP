public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, String cpf) {
        super(nome);
        if (cpf == null) {
            throw new IllegalArgumentException("Cpf obrigatório");
        }
        this.cpf = cpf;
    }


}
