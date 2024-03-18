import java.util.Scanner;

public class Exercicio01 {

    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float numero = leitor.nextFloat();

        if (numero <= 10) {
            System.out.println("Numero menor ou igual a 10");
        }
        else {
            System.out.println("Numero maior que 10");
        }
    }

}
