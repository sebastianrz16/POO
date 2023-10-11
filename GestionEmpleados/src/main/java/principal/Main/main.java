
package principal.Main;
import java.util.Scanner;
import desarrollo.Empleado;
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
       
                             
                          
        db.listarEmpleadoHora();

        // Listar empleados asalariados
        db.listarAsalariados();

        // Modificar el nombre o salario de un empleado por horas
        db. modificarNombre("yancarlos", "nuevo_nombre");
        db.modificarSalarioEmpleadoPorHoras("chango", 50000.0);

        // Obtener empleados por horas después de la modificación
        db.listarEmpleadoHora();

        // Obtener un empleado específico
        Empleado empleadoBuscado = db.buscarEmpleadoPorNombre("andres");
        if (empleadoBuscado != null) {
            System.out.println("Empleado encontrado:");
            System.out.println("Nombre: " + empleadoBuscado.getNombre());
            System.out.println("Salario: " + empleadoBuscado.calcularSalario());
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}   