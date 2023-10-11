
package Service;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import desarrollo.EmpleadoAsalariado;
import desarrollo.EmpleadoPorHorase;
import desarrollo.Empleado;



public class Service {
   
  
 {
    this.empleadosPorHoras = new ArrayList<>(); // Inicializa la lista
}
 public LinkedList<EmpleadoAsalariado> objasalariado;
   private List<EmpleadoAsalariado> empleadosAsalariados;
    private List<EmpleadoPorHorase> empleadosPorHoras;
     

    

     {this.objasalariado = new LinkedList<>();
}
     public void guardarasalariado(
             double deducciones,
             String nombre ,
             double  salarioBase){
            
            
        
       EmpleadoAsalariado nuevaAsalariado = new EmpleadoAsalariado(
              
               deducciones,
               nombre,
               salarioBase) ;
             
             
        
        this.objasalariado.add(nuevaAsalariado);
        
    }
       public void listarAsalariados(){        
        for (EmpleadoAsalariado asalariado : objasalariado) {
            System.out.println("---------");
            System.out.println("Nombre: " + asalariado.getNombre());
            System.out.println("Deducciones: " + asalariado.getDeducciones());
            System.out.println("Salario base: " + asalariado.getSalarioBase());
            
        }
    }
     public void buscarAsalariado(String nombreSolicitado){
        boolean flag = false;
        String datoLocalizado = "";
        
        for (EmpleadoAsalariado asalariado : objasalariado) {
            if (asalariado.getNombre().equalsIgnoreCase(nombreSolicitado)) {
                flag = true;
                datoLocalizado += ("\n ---------");
                datoLocalizado += ("\n Nombre: " + asalariado.getNombre());
                datoLocalizado += ("\n \"Deducciones: " + asalariado.getDeducciones());
                datoLocalizado += ("\n Salario base: " + asalariado.getSalarioBase());

            }
        }
        
        if (flag) {
            System.out.println("Datos encontrados.");
            System.out.println(datoLocalizado);
        } else {
            System.out.println("No se encontradon datos");
        }
    }
     public LinkedList<EmpleadoPorHorase> objporhora;

     {this.objporhora = new LinkedList<>();
}
     public void guardarconhoras(
             int horasTrabajadas,
             double tarifaPorHora ,
             String  nombre,
             double salarioBase){
            
            
        
      EmpleadoPorHorase nuevoEmpleadoHora = new EmpleadoPorHorase  (
              
               horasTrabajadas,
               tarifaPorHora,
              nombre,
               salarioBase) ;
             
             
        
        this.objporhora.add(nuevoEmpleadoHora);
        
    }
       public void listarEmpleadoHora(){        
        for (EmpleadoPorHorase empleadohora : objporhora) {
            System.out.println("---------");
            System.out.println("Nombre: " + empleadohora.getNombre());
            System.out.println("tarifa por hora: " + empleadohora. getTarifaPorHora());
            System.out.println("horas trabajadas: " + empleadohora.getHorasTrabajadas());
            
        }
    }
     public void buscarEmpleadohora(String nombreSolicitado){
        boolean flag = false;
        String datoLocalizado = "";
        
        for (EmpleadoPorHorase empleadohora : objporhora) {
            if (empleadohora.getNombre().equalsIgnoreCase(nombreSolicitado)) {
                flag = true;
                datoLocalizado += ("\n ---------");
                datoLocalizado += ("\n\"Nombre: " + empleadohora.getNombre());
                datoLocalizado += ("\n tarifa por hora: " + empleadohora. getTarifaPorHora());
                datoLocalizado += ("\n horas trabajadas: " + empleadohora.getHorasTrabajadas());

            }
        }
        
        if (flag) {
            System.out.println("Datos encontrados.");
            System.out.println(datoLocalizado);
        } else {
            System.out.println("No se encontradon datos");
        }
    }

  public void modificarNombre(String nombreEmpleado, String nuevoNombre) {
    for (EmpleadoPorHorase empleado : empleadosPorHoras) {
        if (empleado.getNombre().equals(nombreEmpleado)) {
            empleado.setNombre(nuevoNombre); // Modificar el nombre
            System.out.println("Nombre de " + nombreEmpleado + " modificado a " + nuevoNombre);
            return;
        }
    }
    System.out.println("Empleado " + nombreEmpleado + " no encontrado.");
}
 
public void modificarSalarioEmpleadoPorHoras(String nombreEmpleado, double nuevoSalario) {
    for (EmpleadoPorHorase empleado : empleadosPorHoras) {
        if (empleado.getNombre().equals(nombreEmpleado)) {
            empleado.setSalarioBase(nuevoSalario); // Modificar el salario
            System.out.println("Salario de " + nombreEmpleado + " modificado a " + nuevoSalario);
            return;
        }
    }
    System.out.println("Empleado " + nombreEmpleado + " no encontrado.");
}

   private List<Empleado> empleados; // Lista única de empleados
    
    public Service() {
        this.empleados = new ArrayList<>();
    }

    // Resto de tus métodos

    // Agregar un empleado a la lista unificada
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

public Empleado buscarEmpleadoPorNombre(String nombre) {
    for (Empleado empleado : empleadosAsalariados) {
        if (empleado.getNombre().equalsIgnoreCase(nombre)) {
            return empleado;
        }
    }

    for (Empleado empleado : empleadosPorHoras) {
        if (empleado.getNombre().equalsIgnoreCase(nombre)) {
            return empleado;
        }
    }

    return null; // Retorna null si el empleado no se encuentra en ninguna de las listas
}
    
}   

