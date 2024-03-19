import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para a1: ");
        float a1 = leitor.nextFloat();

        System.out.println("Digite um valor para n: ");
        float n = leitor.nextFloat();

        System.out.println("Digite um valor para r: ");
        float r = leitor.nextFloat();

        float an = a1 + (n - 1) * r;

        System.out.println("O n-esimo termo da progressao aritmetica e: " + an);

        leitor.close();
    }

}
