package Academia;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarExcecaoPlanoExercicioObrigatorio() {
        try {
            Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
            PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

            Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
            Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, null);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Plano de exercício obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoMensalidadeObrigatoria() {
        try {
            Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
            PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

            PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
            Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, null, planoExercicio);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Mensalidade obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTreinadorObrigatorio() {
        try {
            Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
            PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
            Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", null, mensalidade, planoExercicio);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Treinador obrigatório", e.getMessage());
        }
    }

    @Test
    void deveAdicionarTreinador() {
        Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

        Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
        Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

        assertEquals("Julia Vieira", aluno.getNomeTreinador());
        assertTrue(personalTrainer.verificarSePossuiAluno(aluno));
    }

    @Test
    void deveMudarTreinador() {
        Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
        PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

        Saida salario2 = new Saida("27/05/2021", 2000.0f, "TED", "Jennifer Santos - salário");
        PersonalTrainer personalTrainer2 = new PersonalTrainer("Jennifer Santos", "00000000000", "jennifersantos@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario2);

        Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
        PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
        Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

        aluno.setTreinador(personalTrainer2);

        assertEquals("Jennifer Santos", aluno.getNomeTreinador());
        assertFalse(personalTrainer.verificarSePossuiAluno(aluno));
        assertTrue(personalTrainer2.verificarSePossuiAluno(aluno));
    }

    @Test
    void deveVerificarMudancaParaTreinadorNulo() {
        try {
            Saida salario = new Saida("27/05/2021", 2000.0f, "TED", "Julia Vieira - salário");
            PersonalTrainer personalTrainer = new PersonalTrainer("Julia Vieira", "00000000000", "juliavieira@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", salario);

            Entrada mensalidade = new Entrada("27/05/2021", 69.99f, "Pix", "Ana Dias - mensalidade");
            PlanoExercicio planoExercicio = new PlanoExercicio("Quarta 14h", "Leg Press - Leg Press 45° 20x");
            Cliente aluno = new Cliente("Ana Dias", "00000000000", "anadias@gmail.com","3255559999", "Rua XII", 10, "Casa fundos", "Fábricas", "JF", "MG", "36300000", personalTrainer, mensalidade, planoExercicio);

            aluno.setTreinador(null);

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Treinador obrigatório", e.getMessage());
        }
    }
}