import java.util.Scanner;

public class CalculaArea {
    public static Double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static Double areaQuadrado(double a) {
        return a * a;
    }

    public static Double areaRetangulo(double comp, double altura) {
        return comp * altura;
    }

    public static void menuCalculadoraArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Area do circulo");
        System.out.println("2 - Area quadrado");
        System.out.println("3 - Area retangulo");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                System.out.printf("%.2f \n",areaCirculo(raio));
                break;
            case 2:
                System.out.print("Digite o valor dos lados do quadrado: ");
                double lado = scanner.nextDouble();
                System.out.printf("%.2f \n ", areaQuadrado(lado));
                break;
            case 3:
                System.out.print("Comprimento do retangulo: ");
                double a = scanner.nextDouble();
                System.out.print("Altura do retangulo: ");
                double b = scanner.nextDouble();
                System.out.printf("%.2f \n", areaRetangulo(a, b));
                break;
            default: 
                System.out.println("opção inexistente!");

        }
    }
}
