package Loja.RH;

public class ColaboradorMarketing extends Colaborador {
    private float adicionalPorMetasCumpridas;

    public float getAdicionalPorMetasCumpridas() {
        return adicionalPorMetasCumpridas;
    }

    public void setAdicionalPorMetasCumpridas(float adicionalPorMetasCumpridas) {
        this.adicionalPorMetasCumpridas = adicionalPorMetasCumpridas;
    }

    @Override
    public float calcularSalarioLiquido () {
        float descontos = this.valorINSS + this.valeTransporte;
        float salarioLiquido = this.salarioBase + this.adicionalPorMetasCumpridas - descontos;

        return salarioLiquido;
    }
}
