import java.util.Scanner;

public class Exercicio02 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = leitor.nextDouble();

        System.out.println("Digite outro numero: ");
        double num2 = leitor.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma dos dois numeros e: " + soma);

    }

}
