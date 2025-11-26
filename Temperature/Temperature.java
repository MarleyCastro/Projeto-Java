
public class Temperature {
    public double temperaturaEmCelsius;

    // A fórmula para converter temperaturas de graus Celsius para Fahrenheit
    public void converterTemperatura() {
        // Aplica a fórmula: (temperatura * 1.8) + 32
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        
        // Exibe a temperatura com casas decimais
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaEmFahrenheit);
        
        // Casting para inteiro (remove as casas decimais)
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
