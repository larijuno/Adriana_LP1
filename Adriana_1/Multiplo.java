//Entrada: Dois números inteiros.
//Processamento: Verificar se o primeiro é múltiplo do segundo.
//Saída: Resultado da verificação.

public class Multiplo {

    String verificar(int num1, int num2) {
        int x;

        if (num1 == 0 || num2 == 0) {
            return "Qualquer número vezes 0 é 0";
        }

        if (num1 < num2) {
            x = num1;
            num1 = num2;
            num2 = x;
        }

        if ((num1 % num2) == 0) {
            return num1 + " é múltiplo de " + num2 + "\nO resultado é " + num1 / num2;
        }
        return num1 + " não é múltiplo de " + num2;
    }
}
