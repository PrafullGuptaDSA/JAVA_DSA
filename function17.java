import java.util.Scanner;

class function17{
    public static void main(String args[]) {
       
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         int a=0, b=1;
        System.out.print(a + " ");
        if(num>1){
        for(int i=2;i<=num;i++){
            System.out.print(b +" ");

            int temp=b;
            b=a+b;
            a=temp;
            }
            
            System.out.println();
        
    }

        
    }
}