import java.util.Scanner;

class function7{
    public static void printTable(int num) {
        for(int i=1;i<=10;i++){
            int mul=i*num;
            System.out.println(mul);
        }
        return;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        printTable(num);
    }
}