

    import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Celsius: " + String.format("%.1f", celsius) + " °C");
        System.out.println("Temperatura em Fahrenheit: " + String.format("%.1f", fahrenheit) + " °F");
        System.out.println("Temperatura em Kelvin: " + String.format("%.2f", kelvin) + " K");

        scanner.close();
    }
}
