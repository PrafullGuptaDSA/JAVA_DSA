import java.util.Scanner;

class function8{
    public static void printAverage(int a ,int b ,int c) {
        double avg=(a+b+c)/2;
        System.out.println("avg="+avg);
        return;
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        printAverage(a, b, c);
    }
}