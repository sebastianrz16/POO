/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos.parcialcorte2;

/**
 *
 * @author ruizs
 */
import lombok.Data;
@Data
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    int horaSalida = -1;
    int horaIngreso, ganancias;
  
    public void setHoraEntrada(int horaEntrada){
        this.horaIngreso = horaEntrada;
    }

    public void uptDineroGenerado() {
        if(horaSalida > horaIngreso)
            ganancias = (horaSalida - horaIngreso) * 15000;
        else
            ganancias = ((24 - horaIngreso) + horaSalida) * 15000;
    }

    public Vehiculo(String marca, String modelo, String placa, int horaEntrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaIngreso = horaEntrada;
    }
}


