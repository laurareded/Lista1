import java.util.Scanner;

public class Exercicio07 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float num = leitor.nextFloat();

        if(num >= 100 && num <= 200) {
            System.out.println("O numero esta no intervalo entre 100 e 200");
        }
        else {
            System.out.println("O numero nao esta no intervalo entre 100 e 200");
        }
    }

}
