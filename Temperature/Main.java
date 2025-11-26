
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature temperature = new Temperature();
        temperature.temperature = sc.nextDouble();
        temperature.comverterTemperature();
    }
}


