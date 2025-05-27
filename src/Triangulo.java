public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String color, String nombre, double posX, double posY,
                     double lado1, double lado2, double lado3) {
        super(color, nombre, posX, posY);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Herón para calcular el área de un triángulo
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Métodos getter para los lados
    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getLado3() { return lado3; }

    // Métodos setter para los lados
    public void setLado1(double lado1) { this.lado1 = lado1; }
    public void setLado2(double lado2) { this.lado2 = lado2; }
    public void setLado3(double lado3) { this.lado3 = lado3; }

    @Override
    public String toString() {
        return super.toString() +
                String.format(" - Triángulo [Lados: %.2f, %.2f, %.2f]", lado1, lado2, lado3);
    }
}