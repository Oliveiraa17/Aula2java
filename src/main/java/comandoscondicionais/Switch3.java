package comandoscondicionais;

import java.util.*;

public class Switch3 {
    public static void main(String[] args) {
        int combo;
        String mensagem;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um combo pelo número:");
        System.out.println("1 - Big mac");
        System.out.println("2 - Mcchicken");
        System.out.println("3 - Quarterão com Queijo");
        System.out.println("4 - Testy Turbo");
        System.out.println("5 - McCrispy Chicken Cajun");

        System.out.print("Digite o número do combo que vc deseja");
        combo = entrada.nextInt();

        switch (combo) {
            case 1:
                mensagem = "Big Mac: Dois hambúrgueres, alface, queijo, molho especial, cebola, picles e pão com gergelim.";
                break;
            case 2:
                mensagem = "Mcchicken: Frango empanado, maionese, alface americana e pão com gergelim.";
                break;
            case 3:
                mensagem = "Quarterão com Queijo: Um hambúrguer (100% carne bovina), queijo processado sabor cheddar, picles, cebola, ketchup, mostarda e pão com gergelim.";
                break;
            case 4:
                mensagem = "Testy Turbo: Os novos sanduíches contêm dois hambúrgueres de carne 100% bovina. O peso total da carne \"in natura\" (somando-se os dois hambúrgueres) aumentou em 51,7% / 77,6 g, passando de 150 g para 227,6 g, em comparação com o peso total de carne \"in natura\" (um hambúrger) presente nas versões anteriores. Composto pelo icônico molho tasty, queijo processado sabor emental, tomate, alface, cebola, tudo isso no pão com gergelim.";
                break;
            case 5:
                mensagem = "McCrispy Chicken Cajun: Composto por pão tipo brioche com batata, queijo processado sabor emental, carne 100% de peito de frango, temperada e empanada, molho cajun, uma maionese temperada picante, defumada, com toque de cebola e limão, alface americana e cebola ao molho shoyu";
            default:
                mensagem = "Número inválido! Escolha um numero de 1 a 5!";
        }
        System.out.println(mensagem);
    }
}
