//Leia a quantidade de dias e a quilometragem percorrida.
// Calcule o preço do aluguel considerando uma diária fixa
// e uma cobrança adicional por quilômetro acima de determinado limite.

public class Aluguel {

    private static final double DIARIA = 90.0;
    private static final double KM_INCLUSO_POR_DIA = 100;
    private static final double VALOR_KM_EXTRA = 0.50;

    private double precoBase;
    private double kmExtra;
    private double taxaExtra;
    private double precoTotal;

    void alugar(int dias, double km) {
        double limiteKm = dias * KM_INCLUSO_POR_DIA;
        precoBase = dias * DIARIA;

        if (km > limiteKm) {
            kmExtra = km - limiteKm;
            taxaExtra = kmExtra * VALOR_KM_EXTRA;
        } else {
            kmExtra = 0;
            taxaExtra = 0;
        }
        precoTotal = precoBase + taxaExtra;
    }

    double getPrecoBase()  { return precoBase; }
    double getKmExtra()    { return kmExtra; }
    double getTaxaExtra()  { return taxaExtra; }
    double getPrecoTotal() { return precoTotal; }
    boolean excedeuLimite() { return kmExtra > 0; }
}
