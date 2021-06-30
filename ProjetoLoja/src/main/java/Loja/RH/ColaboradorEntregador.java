package Loja.RH;

public class ColaboradorEntregador extends Colaborador {
    private float auxilioManutencaoVeiculo;
    private float valorExtraPorPedidoEntregue;
    private int pedidosEntregues;

    public float getAuxilioManutencaoVeiculo() {
        return auxilioManutencaoVeiculo;
    }

    public void setAuxilioManutencaoVeiculo(float auxilioManutencaoVeiculo) {
        this.auxilioManutencaoVeiculo = auxilioManutencaoVeiculo;
    }

    public float getValorExtraPorPedidoEntregue() {
        return valorExtraPorPedidoEntregue;
    }

    public void setValorExtraPorPedidoEntregue(float valorExtraPorPedidoEntregue) {
        this.valorExtraPorPedidoEntregue = valorExtraPorPedidoEntregue;
    }

    public int getPedidosEntregues() {
        return pedidosEntregues;
    }

    public void setPedidosEntregues(int pedidosEntregues) {
        this.pedidosEntregues = pedidosEntregues;
    }

    @Override
    public float calcularSalarioLiquido() {
        float extra = this.valorExtraPorPedidoEntregue * this.pedidosEntregues;
        float salarioLiquido = this.salarioBase + extra - this.valorINSS;

        return salarioLiquido;
    }
}
