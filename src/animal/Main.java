
package animal;
import animal.Animal;
public class Main {

    public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
	    Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();


        //-->Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        
        
        Animal Burro = new burro("Setracho","carnivoro",3,"perezosa");
        Burro.Alimentarse();
        
        burro Burro1 = new burro("Quitacho","Carnivoro",4,"dragona");
        Burro1.Alimentarse();
        
        Animal delfin= new Delfin ("Felinacho","Carnivoro",6,"Pirula");
        delfin.Alimentarse();
        
         Animal delfin1= new Delfin ("Grolvin","Carnivoro",17,"Pegador");
        delfin1.Alimentarse();
    }
}
