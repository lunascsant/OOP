package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridadeProfessor() {
        Professor professor = new Professor();
        Escolaridade escolaridadeProfessor = new Escolaridade();
        escolaridadeProfessor.setFormacao("Doutorado");
        professor.setEscolaridade(escolaridadeProfessor);

        assertEquals("Doutorado", professor.getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarCidadeNascimentoProfessor() {
        Professor professor = new Professor();
        Cidade cidade = new Cidade();
        cidade.setNomeCidade("São João del Rei");
        professor.setNaturalidade(cidade);

        assertEquals("São João del Rei", professor.getCidadeNascimentoProfessor());
    }

    @Test
    void getTipoEnsinoContratadoParaLecionar1() {
        Professor professor = new Professor();
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNomeTipoEnsino("Ensino Fundamental");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Fundamental", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void getTipoEnsinoContratadoParaLecionar2() {
        Professor professor = new Professor();
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNomeTipoEnsino("Ensino Médio");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Médio", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void getTipoEnsinoContratadoParaLecionar3() {
        Professor professor = new Professor();
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNomeTipoEnsino("Ensino Superior");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Superior", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void deveRetornarDiretorProfessor() {
        Professor professor = new Professor();
        Professor professorDiretor = new Professor();
        professorDiretor.setNome("João Silva");
        Curso curso = new Curso();
        Escola escola = new Escola();
        escola.setDirecao(professorDiretor);
        curso.setEscola(escola);
        professor.setContratacao(curso);

        assertEquals("João Silva", professor.getDiretorProfessor());

    }

    @Test
    void deveRetornarCoordenadorProfessor() {
        Professor professor = new Professor();
        Professor professorCoordenador = new Professor();
        professorCoordenador.setNome("Marcos Braga");
        Curso curso = new Curso();
        curso.setCoordenacao(professorCoordenador);
        professor.setContratacao(curso);

        assertEquals("Marcos Braga", professor.getCoordenadorProfessor());
    }
}