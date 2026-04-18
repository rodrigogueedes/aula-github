import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu peso: ");
        Double peso = scanner.nextDouble();
        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Sei IMC é %.2f\n", imc);

        if (imc < 20) {
            System.out.println("Baixo do peso");
        }else if (imc >= 20 && imc < 25) {
            System.out.println("Peso normal ");
        }else if (imc < 30){
            System.out.println("Sobrepeso");
        }else if (imc < 40) {
            System.out.println("Obeso");
        }else{
            System.out.println("Obeso mórbido");
        }

        scanner.close();
    }
}
