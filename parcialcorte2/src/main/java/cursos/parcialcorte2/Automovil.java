/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos.parcialcorte2;

/**
 *
 * @author ruizs
 */
public class Automovil extends Vehiculo{
     private int numeroPuertas;
    // Constructores, getters y setters

    // Otros métodos específicos para automóviles
    
    public Automovil(int numeroPuertas, String marca, String modelo, String placa, int horaEntrada) {
        super(marca, modelo, placa, horaEntrada);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
}