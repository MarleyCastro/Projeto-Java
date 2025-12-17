public class CalculadoraSalaRetangular implements CalculoGeometrico {
    public double area;
    public double perimetro;
    public double altura;
    public double base;

    @Override
    public void calcularArea() {
        this.area = base * altura;
        System.out.println("resultado " + this.area + " cm");
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (base * 2) + (altura * 2);
        System.out.println("resultado " + this.perimetro + " cm²");
    }

}
