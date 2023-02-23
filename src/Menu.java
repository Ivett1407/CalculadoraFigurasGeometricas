import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) throws InputMismatchException {

        Scanner seleccion = new Scanner(System.in);
        System.out.println("\n<===CALCULADOR DE FIGURAS GEOMETRICAS===>\n");
        int opcion = 0;
        boolean salir = true;
        int opcion1 = 0;


        while (salir) {

            try {

                System.out.println("Seleccione una opción del Menú:\n1 - Circulo\n2 - Cuadrado\n3 - Triángulo\n0 - Salir");
                opcion = seleccion.nextInt();

                switch (opcion) {
                    case 1:
                        Scanner seleccion1 = new Scanner(System.in);
                        System.out.println("¿Qué desea saber?:\n1 - El Área\n2 - El Perímetro\n");
                        opcion1 = seleccion1.nextInt();

                        if (opcion1 == 1) {
                            double medida = 0;
                            System.out.println("\nIngrese el radio: ");
                            medida = seleccion.nextInt();
                            Circle circle = new Circle(medida);
                            System.out.println("\nEl área del Círculo es: " +  String.format("%.2f", circle.getArea()));
                        } else {
                            double medida = 0;
                            System.out.println("\nIngrese el radio: ");
                            medida = seleccion.nextInt();
                            Circle circle = new Circle(medida);
                            System.out.println("\nEl perímetro del Círculo es: " +  String.format("%.2f", circle.getPerimeter()));
                        }
                        return;
                    case 2:
                        Scanner seleccion2 = new Scanner(System.in);
                        System.out.println("¿Qué desea saber?:\n1 - El Área\n2 - El Perímetro\n");
                        opcion1 = seleccion2.nextInt();

                        if (opcion1 == 1) {
                            double medida = 0;
                            System.out.println("Ingrese la longitud, de un lado, del cuadrado: ");
                            medida = seleccion2.nextInt();
                            Square square = new Square(medida);
                            System.out.println("El área del Cuadrado es: " +  String.format("%.2f", square.getArea()));
                        } else {
                            double medida = 0;
                            System.out.println("Ingrese la longitud de un lado del cuadrado: ");
                            medida = seleccion.nextInt();
                            Square square = new Square(medida);
                            System.out.println("El perímetro del Cuadrado es: " +  String.format("%.2f", square.getPerimeter()));
                        }
                        return;
                    case 3:
                        double base, lado;
                        Scanner seleccion3 = new Scanner(System.in);
                        System.out.println("¿Qué desea saber?:\n1 - El Área\n2 - El Perímetro\n");
                        opcion1 = seleccion3.nextInt();

                        if (opcion1 == 1) {
                            System.out.println("Ingrese la base del triángulo: ");
                            base = seleccion3.nextDouble();
                            System.out.println("Ingrese el lado del triángulo: ");
                            lado = seleccion3.nextDouble();
                            Triangle triangulo = new Triangle(base, lado);
                            System.out.println("El área del triángulo es: " + String.format("%.2f", triangulo.getArea()));
                        } else {
                            System.out.println("Ingrese la base del triángulo: ");
                            base = seleccion3.nextDouble();
                            System.out.println("Ingrese el lado del triángulo: ");
                            lado = seleccion3.nextDouble();
                            Triangle triangulo = new Triangle(base, lado);
                            System.out.println("El perímetro del triángulo es: " + String.format("%.2f", triangulo.getPerimeter()));
                        }
                        return;
                    case 0:
                        System.out.println("Hasta la proxima...!!\n");
                        return;
                    default:
                        System.out.println("Opción no válida...!!\n");
                }
            } catch (InputMismatchException e) {
                seleccion.nextLine();
                System.out.println("\nOPCIÓN INVALIDA ===> Debe ingresar un número, intente de nuevo...\n");
            }
        }
    }
}




