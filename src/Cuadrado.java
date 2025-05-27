public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String color, String nombre, double posX, double posY, double lado) {
        super(color, nombre, posX, posY);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

