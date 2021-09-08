package Academia;

public abstract class Pessoa {

    private String nome;
    private Endereco endereco;
    private String cpf;
    private String email;
    private String telefone;

    public Pessoa (String nome, String cpf, String email, String telefone, String logradouro, int numero,
                   String complemento, String bairro, String cidade, String uf, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, uf, cep);
    }

    public class Endereco {
        private String logradouro;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String uf;
        private String cep;

        private Endereco(String logradouro, int numero,
                         String complemento, String bairro, String cidade, String uf, String cep) {
            this.logradouro = logradouro;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.cep = cep;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
