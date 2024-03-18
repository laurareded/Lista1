import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();

        System.out.println("Digite um numero diferente: ");
        double b = leitor.nextDouble();

        if (a == b) {
            System.out.println("Sequencia invalida - Numeros iguais");
        } 
        else if (a > b) {
            System.out.println("O maior numero e o primeiro: " + a);
        }
        else if (b > a) {
            System.out.println("O maior numero e o segundo: " + b);
        }

    }

}
