
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Registro registro = new Registro();
        Scanner scanner = new Scanner(System.in);
        terminal: while (true) { 
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante por código");
            System.out.println("4. Modificar promedio");
            System.out.println("5. salir");
            if (!scanner.hasNextInt()) {
            System.out.println("Entrada invalida");
            scanner.nextLine();
            continue;
            }
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Escriba el nombre del estudiante");
                    String nombre = scanner.next();
                    System.out.println("escriba el código del estudiante");
                    int codigo= scanner.nextInt();
                    System.out.println("escriba el promedio del estudiante");
                    double promedio = scanner.nextDouble();
                    Estudiante estudiante = new Estudiante(codigo, nombre, promedio);
                    registro.datos.add(estudiante);
                    break;
                case 2:
                    registro.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.println("escriba el codigo del estudiante");
                    int codigo1 = scanner.nextInt();
                    registro.buscarEstudiante(codigo1);
                    break;
                case 4:
                    System.out.println("ingrese el codigo del estudiante: ");
                    int codigoCambio = scanner.nextInt();
                    System.out.println("ingrese la opcion que desea hacer");
                    System.out.println("1. sumar");
                    System.out.println("2. restar");
                    int operacion = scanner.nextInt();
                    registro.modificarPromedio(codigoCambio, operacion);
                    break;
                case 5:
                    break terminal;
            }
        }
    }
}
