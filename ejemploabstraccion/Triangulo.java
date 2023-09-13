
package cursos.ejemploabstraccion;

public class Triangulo {
 private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método getter para obtener la base
    public double getBase() {
        return base;
    }

    // Método setter para establecer la base
    public void setBase(double base) {
        this.base = base;
    }

    // Método getter para obtener la altura
    public double getAltura() {
        return altura;
    }

    // Método setter para establecer la altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
