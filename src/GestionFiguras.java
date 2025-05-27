import java.util.ArrayList;

public class GestionFiguras {
    private ArrayList<Figura> figuras;

    public GestionFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void eliminarFigura(String nombre) {
        figuras.removeIf(f -> f.getNombre().equalsIgnoreCase(nombre));
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }

    public double calcularPerimetroTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        return total;
    }

    public Figura figuraConMayorArea() {
        if (figuras.isEmpty()) return null;
        Figura mayor = figuras.get(0);
        for (Figura f : figuras) {
            if (f.calcularArea() > mayor.calcularArea()) {
                mayor = f;
            }
        }
        return mayor;
    }

    public Figura figuraConMayorPerimetro() {
        if (figuras.isEmpty()) return null;
        Figura mayor = figuras.get(0);
        for (Figura f : figuras) {
            if (f.calcularPerimetro() > mayor.calcularPerimetro()) {
                mayor = f;
            }
        }
        return mayor;
    }

    public void listarFiguras() {
        for (Figura f : figuras) {
            System.out.println(f + " | Área: " + f.calcularArea() + " | Perímetro: " + f.calcularPerimetro());
        }
    }

    public void listarFigurasTipo(String tipo) {
        for (Figura f : figuras) {
            if (f.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(f + " | Área: " + f.calcularArea() + " | Perímetro: " + f.calcularPerimetro());
            }
        }
    }
}

