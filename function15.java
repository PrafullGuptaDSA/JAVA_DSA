import java.util.Scanner;

class function15{
    public static void main(String args[]) {
        int power=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr number");
        int x=sc.nextInt();
        System.out.println("enter power of value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
             power=(power*x);

        }
        
        System.out.println("power "+ power);

        
    }
}