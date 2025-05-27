public class Circulo extends Figura{
    private double radio;


    public Circulo(String color, String nombre, double posX, double posY, double radio){
        super(color, nombre, posX, posY);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}


