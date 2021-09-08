package Academia;

public class Saida implements MovimentacaoFinanceira {

    private String data;
    private float valor;
    private String meioDeTransacao;
    private String destino;

    public Saida(String data, float valor, String meioDeTransacao, String destino) {
        this.data = data;
        this.valor = valor;
        this.meioDeTransacao = meioDeTransacao;
        this.destino = destino;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMeioDeTransacao() {
        return meioDeTransacao;
    }

    public void setMeioDeTransacao(String meioDeTransacao) {
        this.meioDeTransacao = meioDeTransacao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String produzirComprovante () {
        String comprovante = "Comprovante de saída: \n" + "Valor: R$" + this.valor + "\n" + "Data: "
                + this.data + "\n" + "Destino: " + this.destino + "\n" + "Meio de transação: "
                + this.meioDeTransacao;
        return comprovante;
    }
}
