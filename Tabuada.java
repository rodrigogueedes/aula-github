import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número para tabuada: ");
        int n1 = scanner.nextInt();
        int contador = 1;
        if (n1 < 0) {
            System.out.println("Você digitou um número negativo!!!!!!!");
        } else {
            while (contador <= 10) {
                int calculo = n1 * contador;
                System.out.println(n1 + " x " + contador + " = " + calculo);
                contador++;
            }
        }

        scanner.close();
    }
}
