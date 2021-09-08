package Academia;

public class Entrada implements MovimentacaoFinanceira {

    private String data;
    private float valor;
    private String meioDeTransacao;
    private String origem;

    public Entrada(String data, float valor, String meioDeTransacao, String origem) {
        this.data = data;
        this.valor = valor;
        this.meioDeTransacao = meioDeTransacao;
        this.origem = origem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String produzirComprovante () {
        String comprovante = "Comprovante de entrada: \n" + "Valor: R$" + this.valor + "\n" + "Data: "
                + this.data + "\n" + "Origem: " + this.origem + "\n" + "Meio de transação: "
                + this.meioDeTransacao;
        return comprovante;
    }
}
