import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionFiguras gestor = new GestionFiguras();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir figura");
            System.out.println("2. Eliminar figura");
            System.out.println("3. Calcular área total");
            System.out.println("4. Calcular perímetro total");
            System.out.println("5. Figura con mayor área");
            System.out.println("6. Figura con mayor perímetro");
            System.out.println("7. Listar todas las figuras");
            System.out.println("8. Listar figuras por tipo");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Tipo de figura (Rectangulo, Cuadrado, Circulo, Triangulo): ");
                    String tipo = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Posición X: ");
                    double x = sc.nextDouble();
                    System.out.print("Posición Y: ");
                    double y = sc.nextDouble();

                    switch (tipo.toLowerCase()) {
                        case "rectangulo" -> {
                            System.out.print("Base: ");
                            double base = sc.nextDouble();
                            System.out.print("Altura: ");
                            double altura = sc.nextDouble();
                            gestor.agregarFigura(new Rectangulo(color, nombre, x, y, base, altura));
                        }
                        case "cuadrado" -> {
                            System.out.print("Lado: ");
                            double lado = sc.nextDouble();
                            gestor.agregarFigura(new Cuadrado(color, nombre, x, y, lado));
                        }
                        case "circulo" -> {
                            System.out.print("Radio: ");
                            double radio = sc.nextDouble();
                            gestor.agregarFigura(new Circulo(color, nombre, x, y, radio));
                        }
                        case "triangulo" -> {
                            System.out.print("Lado 1: ");
                            double lado1 = sc.nextDouble();
                            System.out.print("Lado 2: ");
                            double lado2 = sc.nextDouble();
                            System.out.print("Lado 3: ");
                            double lado3 = sc.nextDouble();
                            gestor.agregarFigura(new Triangulo(color, nombre, x, y, lado1, lado2, lado3));
                        }
                        default -> System.out.println("Tipo de figura no válido.");
                    }
                }
                case 2 -> {
                    System.out.print("Nombre de la figura a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    gestor.eliminarFigura(nombreEliminar);
                }
                case 3 -> System.out.println("Área total: " + gestor.calcularAreaTotal());
                case 4 -> System.out.println("Perímetro total: " + gestor.calcularPerimetroTotal());
                case 5 -> {
                    Figura mayorArea = gestor.figuraConMayorArea();
                    if (mayorArea != null)
                        System.out.println("Figura con mayor área: " + mayorArea + " (Área: " + mayorArea.calcularArea() + ")");
                    else
                        System.out.println("No hay figuras.");
                }
                case 6 -> {
                    Figura mayorPerimetro = gestor.figuraConMayorPerimetro();
                    if (mayorPerimetro != null)
                        System.out.println("Figura con mayor perímetro: " + mayorPerimetro + " (Perímetro: " + mayorPerimetro.calcularPerimetro() + ")");
                    else
                        System.out.println("No hay figuras.");
                }
                case 7 -> gestor.listarFiguras();
                case 8 -> {
                    System.out.print("Ingrese tipo de figura a listar: ");
                    String tipoListar = sc.nextLine();
                    gestor.listarFigurasTipo(tipoListar);
                }
                case 9 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        sc.close();
    }
}