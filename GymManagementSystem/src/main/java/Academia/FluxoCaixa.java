package Academia;

import java.util.List;

public class FluxoCaixa {

    public static float calculaFluxoCaixaMensal (List<Entrada> entradas, List<Saida> saidas) {
        if (entradas == null) {
            throw new IllegalArgumentException("É necessário receber uma lista de entradas, mesmo que vazia.");
        } else if (saidas == null) {
            throw new IllegalArgumentException("É necessário receber uma lista de saídas, mesmo que vazia.");
        } else {
            float totalFluxoCaixa = 0.0f;
            for (Entrada entrada : entradas) {
                totalFluxoCaixa += entrada.getValor();
            }
            for (Saida saida : saidas) {
                totalFluxoCaixa -= saida.getValor();
            }
            return totalFluxoCaixa;
        }
    }

}
