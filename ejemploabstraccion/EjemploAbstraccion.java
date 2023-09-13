
package cursos.ejemploabstraccion;

public class EjemploAbstraccion {


    public static void main(String[] args) {
        // Crear un objeto Circulo
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el área del círculo
        double areaCirculo = circulo.calcularArea();
        System.out.println("Área del círculo: " + areaCirculo);

        // Crear un objeto Cuadrado
        Cuadrado cuadrado = new Cuadrado(4.0);

        // Calcular y mostrar el área del cuadrado
        double areaCuadrado = cuadrado.calcularArea();
        System.out.println("Área del cuadrado: " + areaCuadrado);
               // Crear un objeto Triangulo
       
        Triangulo triangulo = new Triangulo(5.0, 8.0);

        // Calcular y mostrar el área del triángulo
        double areaTriangulo = triangulo.calcularArea();
        System.out.println("Área del triángulo: " + areaTriangulo);
    }
}

// Clase concreta que extiende la clase FormaGeometrica
class Cuadrado extends FormaGeometrica {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
    
// Clase abstracta que define una forma geométrica genérica
abstract class FormaGeometrica {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase concreta que extiende la clase FormaGeometrica
class Circulo extends FormaGeometrica {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
