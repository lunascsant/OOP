package exRelampago;

public class AlunoEnsinoMedio extends Aluno {
    public boolean verificaAprovacao() {
        return calculaMediaNotas() >= 6.0f;
    }
}
