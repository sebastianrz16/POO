
package desarrollo;

public  class EmpleadoPorHorase extends Empleado {
 private int horasTrabajadas;   
private double tarifaPorHora;  

    public EmpleadoPorHorase(int horasTrabajadas, double tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
 @Override
     public  double calcularSalario(){
     return 0;
     
     }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

 @Override
    public double getSalarioBase() {
        return salarioBase;
    }

 @Override
    public double getCalcularSalario() {
        return calcularSalario;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    
}
