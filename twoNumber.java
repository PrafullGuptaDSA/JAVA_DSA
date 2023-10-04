import java.util.*;
class TwoNumber{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of first num");
        int a=sc.nextInt();
        
        System.out.println("enter value of second num");
        int b=sc.nextInt();
        
        System.out.println("you enter value of a is " +a +" and value of b is " +b);
        if(a==b){
            System.out.println("a and b both are equal");
        }
        else if(a>b) {
            
                System.out.println("a is greater");   
                     }
        else{
            System.out.println("b is greater");
            }

        }

        
}
