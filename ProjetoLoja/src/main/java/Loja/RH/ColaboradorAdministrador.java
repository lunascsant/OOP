package Loja.RH;

public class ColaboradorAdministrador extends Colaborador {
    private float participacaoNosLucros;

    public float getParticipacaoNosLucros() {
        return participacaoNosLucros;
    }

    public void setParticipacaoNosLucros(float participacaoNosLucros) {
        this.participacaoNosLucros = participacaoNosLucros;
    }

    @Override
    public float calcularSalarioLiquido () {
        float descontos = this.valorINSS + this.valeTransporte;
        float salarioLiquido = this.salarioBase + this.participacaoNosLucros - descontos;

        return salarioLiquido;
    }
}
