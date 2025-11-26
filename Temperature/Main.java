import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = sc.nextDouble();
        
        Temperature temperature = new Temperature();
        temperature.temperaturaEmCelsius = temperaturaCelsius;
        temperature.converterTemperatura();
        
        sc.close();
    }
}
