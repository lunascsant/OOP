package exRelampago;

public class AlunoGraduacao extends Aluno {
    public boolean verificaAprovacao() {
        return calculaMediaNotas() >= 7.0f;
    }
}
