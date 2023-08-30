
package exercise_1;


public class Exercise_1 {

    public static void main(String[] args) {
        
        Exercise_1 ex= new Exercise_1();
        ex.factorial(0);
        System.out.println(ex.factorial(5));
        System.out.println(ex.factorial_r(5));
    }
    
      public int factorial_r(int num) {
       if(num==1|| num==0){
           return 1;}
       return factorial_r(num-1)* num;
    }  
    public int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }                                               

}