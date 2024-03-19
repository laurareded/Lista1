import java.util.Scanner;

public class Exercicio19 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio e a altura do cilindro: ");
        double raio = leitor.nextDouble();
        double altura = leitor.nextDouble();

        double pi = 3.14;

        double volume = pi * (raio * raio) * altura;

        System.out.println("O volume do cilindro e: " + volume);

        leitor.close();
    }

}
