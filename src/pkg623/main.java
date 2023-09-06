package pkg623;
import exercise.persona;
public class main{
public static void  main (String[] args){
    persona[] arrayperson = new persona[3];
    arrayperson[0] = new persona("Juan","rodriguez","2939320932");
    arrayperson[1] = new persona("Daniel","ruiz","1298302932");
    arrayperson[2] = new persona("Camilo","martinez","21938932");
    for(persona persota : arrayperson){
        System.out.println("-----------------------");
        System.out.println(persota.getNombre());
        System.out.println(persota.getApellido());
        System.out.println(persota.getDocumento());
        System.out.println("-----------------------");
        
    }
}
}
