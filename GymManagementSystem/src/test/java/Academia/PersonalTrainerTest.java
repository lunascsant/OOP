package Academia;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonalTrainerTest {

    @Test
    void deveRetornarExcecaoSalarioObrigatorio() {
        try {
            PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário obrigatório", e.getMessage());
        }
    }

    @Test
    void deveAdicionarAluno() {
        Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

        Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
        Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

        assertTrue(personalTrainer.verificarSePossuiAluno(aluno));
        assertEquals("Julia Vieira", aluno.getNomeTreinador());
    }

    @Test
    void deveRetornarExcecaoAlunoHorarioInviavel() {
        try {
            Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
            PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

            Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
            PlanoExercicio planoExercicio = new PlanoExercicio("Sábado 14h", "Leg Press - Leg Press 45° 20x");
            Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno com plano de exercício com horário inviável.", e.getMessage());
        }
    }

    @Test
    void deveAdicionarAlunoOutroTreinador() {
        Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

        Saida salario2 = new Saida("27/05/2021", 2000.0f, "TED", "Jennifer Santos - salário");
        PersonalTrainer personalTrainer2 = new PersonalTrainer("Jennifer Santos", "00000000000", "jennifersantos@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario2);

        Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
        Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

        personalTrainer2.adicionarAluno(aluno);

        assertFalse(personalTrainer.verificarSePossuiAluno(aluno));
        assertTrue(personalTrainer2.verificarSePossuiAluno(aluno));
        assertEquals("Jennifer Santos", aluno.getNomeTreinador());
    }

    @Test
    void deveAdicionarAlunoMesmoTreinador() {
        Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

        Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
        Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

        personalTrainer.adicionarAluno(aluno);

        assertTrue(personalTrainer.verificarSePossuiAluno(aluno));
        assertEquals("Julia Vieira", aluno.getNomeTreinador());
    }

    @Test
    void deveMudarTreinadorAluno() {
        Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

        Saida salario2 = new Saida("27/05/2021", 2000.0f, "TED", "Jennifer Santos - salário");
        PersonalTrainer personalTrainer2 = new PersonalTrainer("Jennifer Santos", "00000000000", "jennifersantos@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario2);

        Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
        Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

        personalTrainer.mudarTreinadorAluno(aluno, personalTrainer2);

        assertFalse(personalTrainer.verificarSePossuiAluno(aluno));
        assertTrue(personalTrainer2.verificarSePossuiAluno(aluno));
        assertEquals("Jennifer Santos", aluno.getNomeTreinador());
    }
}