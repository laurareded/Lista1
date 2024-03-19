import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as coordenadas de P1 (x1, y1): ");
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();

        System.out.println("Digite as coordenadas de P2 (x2, y2): ");
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();

        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("A distancia entre os pontos e: " + d);

        leitor.close();
    }

}
