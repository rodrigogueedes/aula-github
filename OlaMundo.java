import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Olá mundo, %s", nome );

        scanner.close();

    }
}
