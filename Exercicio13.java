import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double a = leitor.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double b = leitor.nextDouble();

        System.out.println("Agora digite o operador (+, -, *, /): ");
        char operador = leitor.next().charAt(0);

        double resultado = 0;

        if(operador == '+') {
            resultado = a + b;
            System.out.println("Resultado: " + resultado);
        }
        else if(operador == '-') {
            resultado = a - b;
            System.out.println("Resultado: " + resultado);
        }
        else if(operador == '/') {
            if(b != 0) {
                resultado = a / b;
                System.out.println("Resultado: " + resultado);
            }
            else{
                System.out.println("Erro divisao por zero");
            }
        }
        else if(operador == '*') {
            resultado = a * b;
            System.out.println("Resultado: " + resultado);
        }
        else{
            System.out.println("Operador nao definido");
        }


    }

}
