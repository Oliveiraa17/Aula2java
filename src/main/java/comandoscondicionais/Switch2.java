package comandoscondicionais;

import java.util.*;

public class Switch2 {
    public static void main(String[] args) {
        int numeroMes;
        String mensagem;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        numeroMes = entrada.nextInt();

        switch (numeroMes) {
            case 1:
                mensagem = "Janeiro";
                break;
            case 2:
                mensagem = "Fevereiro";
                break;
            case 3:
                mensagem = "Março";
                break;
            case 4:
                mensagem = "Abril";
                break;
            case 5:
                mensagem = "Maio";
                break;
            case 6:
                mensagem = "Junho";
                break;
            case 7:
                mensagem = "Julho";
                break;
            case 8:
                mensagem = "Agosto";
                break;
            case 9:
                mensagem = "Setembro";
                break;
            case 10:
                mensagem = "Outubro";
                break;
            case 11:
                mensagem = "Novembro";
                break;
            case 12:
                mensagem = "Dezembro";
                break;
            default:
                mensagem = "Número inválido. Por favor, insira um número entre 1 e 12.";
                break;
        }

        System.out.println("Mês: " + mensagem);
    }
}