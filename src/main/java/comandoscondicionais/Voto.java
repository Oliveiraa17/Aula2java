package comandoscondicionais;
import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {

        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        idade = entrada.nextInt();

        if(idade >=18 && idade <=69) {
            System.out.println("Seu voto é obrigatório!");
        }else if (idade >=16 || idade >69){
            System.out.println("Seu voto é opcional");
        }else{
            System.out.println("Vc não pode votar");
        }
    }
}
