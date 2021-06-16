package exRelampago;

public class Aluno extends Pessoa {

    private float notaAvaliacao1;
    private float notaAvaliacao2;
    private String matricula;

    public float getNotaAvaliacao1() {
        return notaAvaliacao1;
    }

    public void setNotaAvaliacao1(float notaAvaliacao1) {
        this.notaAvaliacao1 = notaAvaliacao1;
    }

    public float getNotaAvaliacao2() {
        return notaAvaliacao2;
    }

    public void setNotaAvaliacao2(float notaAvaliacao2) {
        this.notaAvaliacao2 = notaAvaliacao2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float calculaMediaNotas() {
        return (this.notaAvaliacao1 + this.notaAvaliacao2) / 2.0f;
    }
}
