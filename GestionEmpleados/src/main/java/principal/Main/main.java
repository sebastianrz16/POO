
package principal.Main;
import java.util.Scanner;
import desarrollo.EmpleadoAsalariado;
import Service.Service;
public class main {
    public static void main(String[] args) {
       Service db = new Service();
  Scanner scanner = new Scanner(System.in);
       
       db.guardarasalariado(
               50.000,
               "sebacho",
               1.000000 );
         db.guardarasalariado(
               80.000,
               "alberto",
               2.000000 );
           db.guardarasalariado(
               30.000,
               "leyder",
               2.000000 );
             db.guardarasalariado(
               50.000,
               "jordan",
               8.000000 );
               db.guardarasalariado(
               192.000,
               "andres",
               10.000000 );
               //asalariados
             db.guardarconhoras(5, 1000, "yancarlos", 10000);
                 db.guardarconhoras(9, 2000, "chango", 30000);
                     db.guardarconhoras(12, 4000, "gregori", 50000);
                         db.guardarconhoras(3, 9000, "alfonso", 90000);
                             db.guardarconhoras(1, 1000000, "henry", 30000);
       
                             
                          int opcion;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1 - Obtener Empleados por horas");
            System.out.println("2 - Obtener Empleados Asalariados");
            System.out.println("3 - Modificar el nombre o salario de un empleado");
            System.out.println("4 - Obtener Empleados por horas (Para verificar que se modificó)");
            System.out.println("5 - Obtener un empleado específico");
            System.out.println("6 - Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        
            switch (opcion) {
                case 1:
                    // Obtener Empleados por horas
                    db.listarEmpleadoHora();
                    break;
                case 2:
                    // Obtener Empleados Asalariados
                    db. buscarAsalariado();
                    break;
                case 3:
                    // Modificar el nombre o salario de un empleado
                    System.out.println("Ingrese el nombre del empleado que desea modificar:");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.println("Ingrese el nuevo nombre:");
                    String nuevoNombre = scanner.nextLine();
                    System.out.println("Ingrese el nuevo salario:");
                    double nuevoSalario = scanner.nextDouble();
                    db.modificarEmpleado(nombreEmpleado, nuevoNombre, nuevoSalario);
                    break;
                case 4:
                    // Obtener Empleados por horas después de la modificación
                    db.listarEmpleadoHora();
                    break;
                case 5:
                    // Obtener un empleado específico
                    System.out.println("Ingrese el nombre del empleado que desea buscar:");
                    String nombreBuscado = scanner.nextLine();
                    db.buscarEmpleado(nombreBuscado);
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
}
    

