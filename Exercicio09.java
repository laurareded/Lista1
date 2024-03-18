import java.util.Scanner;

public class Exercicio09 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float a = leitor.nextFloat();

        System.out.println("Digite mais um numero: ");
        float b = leitor.nextFloat();

        if(a == b) {
            System.out.println("Os dois numeros sao iguais");
        }
        else {
            System.out.println("Os dois numeros sao diferentes");
            if(a > b) {
                System.out.println("O primeiro numero e o maior");
            }
            else {
                System.out.println("O segundo numero e o maior");
            }
        }
    }

}
