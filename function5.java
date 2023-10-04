import java.util.Scanner;

class function5{
    public static void printPrime(int num,int count) {
        count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
            count ++;
            
        }
        }
        if(count==2){
            System.out.println("prime");
            return;
        }
         else{
            System.out.println("not prime");
            return;
        }
        }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         printPrime(num,num);
 
        
    }
}