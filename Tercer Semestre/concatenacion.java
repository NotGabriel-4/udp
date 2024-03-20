import java.util.Scanner;

public class concatenacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        System.out.println("Hello " + palabra);
        scanner.close();
    }
}