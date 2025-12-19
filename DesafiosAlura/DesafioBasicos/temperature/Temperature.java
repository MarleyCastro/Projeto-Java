package temperature;
import java.util.Scanner;
    

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperaturaPadrao c = new ConversorTemperaturaPadrao();
        System.out.print("Digigte um valor ceusius: ");
        c.celsius = sc.nextDouble();
        
        System.out.print("Digigte um valor fahrenheit: ");
        c.fahrenheit = sc.nextDouble();
        
        c.celsiusParaFahrenheit();
        c.fahrenheitParaCelsius();
        
    }
    
}
