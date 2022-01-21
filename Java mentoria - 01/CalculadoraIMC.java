import java.util.Scanner;

public class CalculadoraIMC {
    private static Double imc(double altura, double peso){
        return peso / Math.pow(altura, 2);
    }

    public static void menuCalculaIMC(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.printf("%.2f \n", imc(altura, peso));
    } 
}
