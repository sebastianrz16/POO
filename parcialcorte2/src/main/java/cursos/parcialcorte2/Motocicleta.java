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
public class Motocicleta extends Vehiculo{
      private int cilindrada;

    // Creamos los constructores, getters y setters

    // Insertamos otros métodos específicos para motocicletas

    public Motocicleta(int cilindrada, String marca, String modelo, String placa, int horaDeEntrada) {
        super(marca, modelo, placa, horaDeEntrada);
        this.cilindrada = cilindrada;
    }  
    
}
