import java.util.*;
class function9{
    public static void printSumOdd(int num) {
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(" total 1 to enterd number odd num sum: "+sum);
        return;
        
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        printSumOdd(num);

        
    }
}