//Leia a distância da viagem e o preço do combustível.
// Calcule quanto será gasto, considerando que o carro faz 12 km/L.
// Se a viagem tiver mais de 500 km, aplique um desconto de 5% no custo calculado.

public class Viagem {

    private static final double KM_POR_LITRO = 12.0;
    private static final double LIMITE_KM = 500;
    private static final double PERCENTUAL_DESCONTO = 5;

    private double litros;
    private double gasto;
    private double desconto;
    private boolean temDesconto;

    void calcular(double km, double precoCombustivel) {
        litros = km / KM_POR_LITRO;
        gasto = litros * precoCombustivel;

        if (km > LIMITE_KM) {
            temDesconto = true;
            desconto = (gasto / 100) * PERCENTUAL_DESCONTO;
        } else {
            temDesconto = false;
            desconto = 0;
        }
    }

    double getLitros()    { return litros; }
    double getGasto()     { return gasto; }
    double getDesconto()  { return desconto; }
    double getTotal()     { return gasto - desconto; }
    boolean temDesconto() { return temDesconto; }
}
