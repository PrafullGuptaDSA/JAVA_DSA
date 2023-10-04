import java.util.Scanner;

class function11{
    public static void printCircumference(int r) {
        double Circumference=2*3.14*r;
        System.out.println("Circumference "+Circumference);
        return;
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        printCircumference(r);

        
    }
}