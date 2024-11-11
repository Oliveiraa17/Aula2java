package comandoscondicionais;

import java.util.Scanner;

public class MenorDeTresNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("Entre com o terceiro número: ");
        int num3 = entrada.nextInt();

        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O menor número é: " + menor);

    }
}

