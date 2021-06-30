package Loja.RH;

import java.util.List;

public class FolhaPagamento {

    public static float calcularTotalFolhaPagamento(List<Colaborador> colaboradores) {
        float totalFolhaPagamento = 0.0f;
        for (Colaborador colaborador : colaboradores) {
            totalFolhaPagamento += colaborador.calcularSalarioLiquido();
        }
        return totalFolhaPagamento;
    }

}
