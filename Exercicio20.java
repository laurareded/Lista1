import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tempo em hora da viagem: ");
        double tempo = leitor.nextDouble();

        System.out.println("Digite a velocidade media da viagem: ");
        double velocidade = leitor.nextDouble();

        double litro = 12;

        double distancia = tempo * velocidade;

        double litrosgastos = distancia / litro;

        System.out.println("Quantidades de litros gastos na viagem: " + litrosgastos);

        leitor.close();
    }

}
