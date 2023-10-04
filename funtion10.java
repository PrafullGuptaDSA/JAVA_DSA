import java.util.Scanner;
import java.util.*;

class funtion10{
    public static void printGratestNumber(int a,int b) {
        if(a>b){
            System.out.println(a +" is greater");
            return;
        }
        else{
            System.out.println(b+" is greater");
            return;
        }
        
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printGratestNumber(a, b);
        
    }
}