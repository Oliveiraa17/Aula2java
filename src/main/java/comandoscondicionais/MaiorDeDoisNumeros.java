package comandoscondicionais;

import java.util.Scanner;

public class MaiorDeDoisNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }

    }
}
