import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota da prova 1 e o peso dela: ");
        float nota1 = leitor.nextFloat();
        float peso1 = leitor.nextFloat();

        System.out.println("Digite a nota da prova 2 e o peso dela: ");
        float nota2 = leitor.nextFloat();
        float peso2 = leitor.nextFloat();

        System.out.println("Digite a nota da prova 3 e o peso dela: ");
        float nota3 = leitor.nextFloat();
        float peso3 = leitor.nextFloat();

        float media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("A media ponderada e: " + media);

        leitor.close();


    }

}
