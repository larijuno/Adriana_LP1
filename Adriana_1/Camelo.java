//5-OS TRINTA E CINCO CAMELOS
//— Somos irmãos — esclareceu o mais velho — e recebemos como herança esses 35 camelos.
// Segundo a vontade expressa de meu pai, devo eu receber a metade,
// o meu irmão Hamed Namir uma terça parte, e ao Harim, o mais moço,
// deve tocar apenas a nona parte.
// Não sabemos, porém, como dividir dessa forma 35 camelos.
// A cada partilha proposta, segue-se a recusa dos outros dois,
// pois a metade de 35 é 17 e meio! Como fazer a partilha,
// se a terça parte e a nona parte de 35 também não são exatas?
//
//Entrada: Quantidade de camelos, parcela de divisões.
//Processamento: cálculo
//Saída: lista com a quantidade de camelos para cada pessoa.

public class Camelo {

    private int qtdCamelos;
    private int irmao1, irmao2, irmao3;

    void dividir(int qtdCamelos) {
        this.qtdCamelos = qtdCamelos;

        if (qtdCamelos % 2 == 0) {
            irmao1 = qtdCamelos / 2;
            irmao2 = qtdCamelos / 3;
            irmao3 = qtdCamelos / 9;
        } else {
            irmao1 = (qtdCamelos + 1) / 2;
            irmao2 = (qtdCamelos + 1) / 3;
            irmao3 = (qtdCamelos + 1) / 9;
        }
    }

    int getIrmao1() { return irmao1; }
    int getIrmao2() { return irmao2; }
    int getIrmao3() { return irmao3; }
    int getSobra()  { return qtdCamelos - irmao1 - irmao2 - irmao3; }
}
