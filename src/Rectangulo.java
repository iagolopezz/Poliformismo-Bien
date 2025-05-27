public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, String nombre, double posX, double posY, double base, double altura) {
        super(color, nombre, posX, posY);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
