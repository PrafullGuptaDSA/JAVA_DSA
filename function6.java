import java.util.Scanner;

class function6{
    public static void printEvenOdd(int num) {
        if(num%2==0){
            System.out.println("even number");
            return;
        }
        else{
            System.out.println("odd number");
            return;
        }
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printEvenOdd(num);

        
    }
}