import java.util.Scanner;

class function2{
    public static int printSum(int num1, int num2) {
        int sum=num1+num2;
        return sum;
        
    }
    public static void main(String arg[]) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=printSum(num1,num2);
        System.out.println("sum of two num is "+sum);
        
    }
}