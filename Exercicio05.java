import java.util.Scanner;

public class Exercicio05 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float a = leitor.nextFloat();

        System.out.println("Digite o segundo numero: ");
        float b = leitor.nextFloat();

        float num1 = a;
        float num2 = b;

        float aux = a;
        a = b;
        b = aux;

        System.out.println("Numeros antes da troca: ");
        System.out.println("Primeiro numero: " + num1);
        System.out.println("Segundo numero: " + num2);

        System.out.println("Numeros apos troca: ");
        System.out.println("Primeiro numero: " + a);
        System.out.println("Segundo numero: " + b);


    }

}
