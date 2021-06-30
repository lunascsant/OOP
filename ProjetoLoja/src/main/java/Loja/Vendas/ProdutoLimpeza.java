package Loja.Vendas;

public class ProdutoLimpeza extends Produto {
    private float volume;
    private String aroma;
    private boolean ehToxico;

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public boolean ehToxico() {
        return ehToxico;
    }

    public void setEhToxico(boolean ehToxico) {
        this.ehToxico = ehToxico;
    }
}
