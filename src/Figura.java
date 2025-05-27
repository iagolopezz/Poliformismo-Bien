public class Figura {
    String color;
    String nombre;
    double posX;
    double posY;

    public Figura(String color, String nombre, double posX, double posY) {
        this.color = color;
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPosX() { return posX; }
    public double getPosY() { return posY; }

    public void cambiarPos(double x, double y) {
        this.posX = x;
        this.posY = y;
    }

    @Override
    public String toString() {
        return nombre + " (" + color + ") en (" + posX + ", " + posY + ")";
    }
}

