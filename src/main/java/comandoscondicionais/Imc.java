package comandoscondicionais;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {

        double imc;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o seu IMC: ");
        imc = entrada.nextDouble();

        if (imc < 18.5) {
            System.out.println("Classificação: abaixo do peso @_@!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Classificação: Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade III (mórbida)");
        }
    }
}
