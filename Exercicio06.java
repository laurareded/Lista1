import java.util.Scanner;

public class Exercicio06 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = leitor.nextDouble();

        double fah = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit e: " + fah);
    }

}
