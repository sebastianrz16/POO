package exercise_class;
import call.unicauca.edu.co.ex_atrr;

public class Exercise_class {

   
    public static void main(String[] args) {
      
        ex_atrr atrr = new ex_atrr();
        System.out.println("Acces var:");
        System.out.println("Name import:" +  atrr.nombre);
        
        atrr.nombre = "Sebacho"; 
        System.out.println("Name import:" +  atrr.nombre);
        
         System.out.println("Import year :" +  atrr.year_hbd);
    }
    
}
