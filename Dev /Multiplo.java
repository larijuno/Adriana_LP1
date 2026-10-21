import java.util.Scanner;

//Entrada: Dois números inteiros.
//Processamento: Verificar se o primeiro é múltiplo do segundo.
//Saída: Resultado da verificação.

public class Multiplo {

    void multiplicar() {
        int num1;
        int num2;
        int x;
        Scanner s = new Scanner(System.in);

        IO.println("Digite um número");
        num1 = s.nextInt();

        IO.println("Digite um número");
        num2 = s.nextInt();

        if (num1 == 0 || num2 == 0) {
            IO.println("Qualquer número vezes 0 é 0");
        } else {
            if (num1 < num2) {
                x = num1;
                num1 = num2;
                num2 = x;
            }
            if ((num1 % num2) == 0) {
                IO.println(num1 + " é múltiplo de " + num2);
                IO.println("O resultado é " + num1 / num2);
            } else {
                IO.println(num1 + " não é múltiplo de " + num2);
            }
        }
    }
}
