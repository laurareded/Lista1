import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 5: ");
        int num = leitor.nextInt();

        if(num <= 5 && num >= 1) {
            if(num == 1) {
                System.out.println("Um");
            }
            if(num == 2) {
                System.out.println("Dois");
            }
            if(num == 3) {
                System.out.println("Tres");
            }
            if(num == 4) {
                System.out.println("Quatro");
            }
            if(num == 5) {
                System.out.println("Cinco");
            }
        }
        else {
            System.out.println("Numero invalido");
        }
    }

}
