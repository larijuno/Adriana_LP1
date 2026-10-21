//Uma estação meteorológica registrou a temperatura média do município de São José dos Campos.
// Leia cada temperatura em graus Celsius. Se estiver abaixo de 18 °C, informe "Frio";
// caso contrário, informe "Temperatura agradável".
// Em seguida, determine se em São José dos Campos a temperatura é, em geral, agradável ou faz frio.

public class Temperatura {

    private final String[] meses = {
            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"
    };
    private final int[] temp = {
            24, 24, 24, 22, 19, 18,
            18, 19, 20, 22, 23, 24
    };

    int getQuantidadeMeses() { return meses.length; }
    String getMes(int i)     { return meses[i]; }
    int getTemp(int i)       { return temp[i]; }

    String classificar(int temperatura) {
        if (temperatura < 18) {
            return "Frio";
        }
        return "Temperatura agradável";
    }

    double media() {
        int soma = 0;
        for (int t : temp) {
            soma += t;
        }
        return soma / (double) temp.length;
    }

    boolean geralmenteAgradavel() {
        return media() >= 18;
    }
}
