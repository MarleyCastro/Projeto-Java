package temperature;


public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    public double fahrenheit;
    public double celsius;

    @Override
    public void fahrenheitParaCelsius() {
        celsius = (fahrenheit - 32) / 1.8 ; 
        System.out.println("Resultado de Fahrenheit Para Celsius: " + celsius);
    }

    @Override
    public void celsiusParaFahrenheit() {
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Resultado de Celsius Para Fahrenheit: " + fahrenheit);
    }
    
}
