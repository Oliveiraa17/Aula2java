package comandoscondicionais;

import java.util.Scanner;

public class CreditoSaldoMedio {

    public static void main(String[] args) {

        double saldoMedio, credito;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o saldo médio: ");
        saldoMedio = entrada.nextDouble();

        if (saldoMedio >= 0 && saldoMedio <= 500) {
            System.out.println("Nenhum crédito disponível.");
        } else if (saldoMedio >= 501 && saldoMedio <= 1000) {
            credito = saldoMedio * 0.30;
            System.out.println("Crédito disponível: " + credito);
        } else if (saldoMedio >= 1001 && saldoMedio <= 3000) {
            credito = saldoMedio * 0.40;
            System.out.println("Crédito disponível: " + credito);
        } else if (saldoMedio > 3000) {
            credito = saldoMedio * 0.50;
            System.out.println("Crédito disponível: " + credito);
        } else {
            System.out.println("Saldo médio inválido.");
        }

    }
}