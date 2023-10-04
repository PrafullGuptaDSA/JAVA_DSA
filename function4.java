import java.util.Scanner;

class function4{
    public static void printFactorial(int num) {
        if(num<0){
            System.out.println("Invalid number");
            return; 
        }
        int fact=1;
        for(int i=num;i>=1;i--){
             fact=i*fact;
        }
        System.out.println("factorial "+fact);
        return;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         printFactorial(num);

        
    }
}