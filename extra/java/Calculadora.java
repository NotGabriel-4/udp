import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora\n1.Suma:\n2.Resta:\n3.Multiplicación:\n4.División:");
        int operacion;
        operacion = scanner.nextInt();

        int var1 = 0, var2 = 0;
        switch (operacion) {
            case 1:
                System.out.println("Ingrese los numeros a sumar, ingrese 0 para terminar");
                do {
                    var1 = scanner.nextInt();
                    var2 += var1;
                } while (var1 != 0);
                System.out.print(var2);
                break;

            case 2:
                break;

            case 3:
                System.out.println("Multiplicación");
                break;

            case 4:
                System.out.println("División");
                break;
        }
        scanner.close();
    }
}
