
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor total de la compra: ");
        double valorTotal = scanner.nextDouble();

        if (valorTotal > 100000) {
            valorTotal = valorTotal * 0.90;
            System.out.println("Nuevo total con descuento: $" + valorTotal);
            
        }


        scanner.close();
    }
}
