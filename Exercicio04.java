import java.util.Scanner;

public class Exercicio04 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float num1 = leitor.nextFloat();

        System.out.println("Digite o segundo numero: ");
        float num2 = leitor.nextFloat();

        float soma = num1 + num2;
        float sub = num1 - num2;
        float div = num1 / num2;
        float mult = num1 * num2;

        System.out.println("A soma dos numeros e: " + soma);
        System.out.println("A subtracao dos numeros e: " + sub);
        System.out.println("A divisao dos numeros e: " + div);
        System.out.println("A multiplicacao dos numeros e: " + mult);

    }

}


