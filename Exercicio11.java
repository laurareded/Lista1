import java.util.Scanner;
import java.util.Arrays;

public class Exercicio11 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = leitor.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Numeros em ordem crescente: ");
        for(int numero : numeros ) {
            System.out.println(numero);
        }

    }

}
