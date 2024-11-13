package comandoscondicionais;

import java.util.*;

public class Switch4 {
    public static void main(String[] args) {
        int codigoCargo;
        String mensagem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um codigo de cargo: ");
        System.out.println("0001 - Programador Estagiário");
        System.out.println("0002 - Programador Junior");
        System.out.println("0003 - Programador Pleno");
        System.out.println("0004 - Programador Senior");
        System.out.println("0005 - Programador Master");
        System.out.println("Código do cargo");
        codigoCargo = entrada.nextInt();

        switch (codigoCargo) {
            case 1:
                mensagem = "Programador Estagiario - Novo Salário:" + (1400 * 1.10) + "reais";
                break;
            case 2:
                mensagem = "Programador Junior - Novo Salário: " + (3000 * 1.12) + " reais";
                break;
            case 3:
                mensagem = "Programador Pleno - Novo Salário: " + (5500 * 1.13) + " reais";
                break;
            case 4:
                mensagem = "Programador Senior - Novo Salário: " + (8000 * 1.15) + " reais";
                break;
            case 5:
                mensagem = "Programador Master - Novo Salário: " + (12000 * 1.18) + " reais";
                break;
            default:
                mensagem = "Código invalido! Por favor, Insira um codigo de 0001 a 0005 Por favor!";
                break;
        }
        System.out.println(mensagem);
    }
}
