import java.util.Scanner;

public class CalculadoraPadrao {

    public static Double soma(double a, double b) {
        return a + b;
    }

    public static Double subtracao(double a, double b) {
        return a - b;
    }

    public static Double divisao(double a, double b) {
        return a / b;
    }

    public static Double multiplicacao(double a, double b) {
        return a * b;
    }

    public static Double exponenciacao(double a, double b) {
        return Math.pow(a, b);
    }

    public static void menuCalculadoraPadrao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Operação de soma");
        System.out.println("2 - Operação de subtração");
        System.out.println("3 - Operação de divisão");
        System.out.println("4 - Operação de multiplicação");
        System.out.println("5 - Operação de exponenciação");
        int menu = scanner.nextInt();
        System.out.print("Digite o primeiro número da operação: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número da operação: ");
        double b = scanner.nextDouble();
        switch (menu) {
            case 1:
                System.out.printf("%.2f \n", soma(a, b));
                break;
            case 2:
                System.out.printf("%.2f \n", subtracao(a, b));
                break;
            case 3:
                System.out.printf("%.2f \n", divisao(a, b));
                break;
            case 4:
                System.out.printf("%.2f \n", multiplicacao(a, b));
                break;
            case 5:
                System.out.printf("%.2f \n", exponenciacao(a, b));
                break;
            default:
                System.out.println("opção inexistente!");
        }
    }
}
