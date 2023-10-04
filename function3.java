import java.util.*;
class function3{
    public static int printMul(int num1,int num2) {
        // int mul=num1*num2;
        // return mul;
        return num1*num2;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        // int mul=printMul(num1,num2);
        System.out.println("product "+printMul(num1, num2));
    }
}