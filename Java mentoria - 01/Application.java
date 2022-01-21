import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char resp = ' ';
            do {
                int escolha = menu();
                switch (escolha) {
                    case 1:
                        CalculadoraPadrao.menuCalculadoraPadrao();
                        break;
                    case 2:
                        CalculaArea.menuCalculadoraArea();
                        break;
                    case 3:
                        CalculadoraIMC.menuCalculaIMC();
                        break;
                }
                System.out.println("Deseja continuar? s/n");
                resp = scanner.next().charAt(0);
            } while (resp != 'n');
        } catch (InputMismatchException e) {
            System.out.println("Valo de entrada inválido!");
        }
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBem vindos a calculadora desenvolvida em Java");
        System.out.println("1 - Calculdora Padrão");
        System.out.println("2 - Calculadora Area");
        System.out.println("3 - Calculadora IMC");
        return scanner.nextInt();
    }
}