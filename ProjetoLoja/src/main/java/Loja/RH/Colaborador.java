package Loja.RH;

public abstract class Colaborador {
    private String nome;
    private String cpf;
    protected float salarioBase;
    protected float valorINSS;
    protected float valeTransporte;

    public float getValorINSS() {
        return valorINSS;
    }

    public void setValorINSS(float valorINSS) {
        this.valorINSS = valorINSS;
    }

    public float getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(float valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalarioLiquido();
}
