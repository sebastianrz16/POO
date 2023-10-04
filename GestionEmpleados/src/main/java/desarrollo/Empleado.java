/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo;

public abstract class Empleado {
private String nombre;
double salarioBase;
double calcularSalario;
    public  Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.calcularSalario= calcularSalario;
    }
    
 
    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }//sancocho
    
    public void calcularSalario(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getCalcularSalario() {
        return calcularSalario;
    }
    public abstract double calcularSalario();
   

}
