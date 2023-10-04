
package desarrollo;

import java.util.LinkedList;
public  class EmpleadoAsalariado extends Empleado  {
    private double deducciones;
   
    public EmpleadoAsalariado(double deducciones,String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.deducciones=deducciones;
    }



    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }
    
    public void calcularSalario(double salarioBase, double deducciones){
        this.salarioBase = salarioBase;
        this.deducciones=deducciones;
    }

    
  
    
    @Override
     public double calcularSalario() {
           
        return 0;
           
     }}

