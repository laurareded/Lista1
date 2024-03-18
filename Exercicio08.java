import java.util.Scanner;

public class Exercicio08 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float num = leitor.nextFloat();

        if(num  >= 50) {
            System.out.println("O numero e maior ou igual a 50");
        }
        else {
            System.out.println("O numero e menor que 50");
        }
    }

}
