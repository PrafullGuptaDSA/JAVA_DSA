import java.util.Scanner;

class function14{
    public static void main(String args[]) {
        int positive=0 , negative=0 , zeros=0;
        System.out.println(" enetr 1 for start or 0 to end");
        
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        while(input==1){
            System.out.println("enter your number");
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                zeros++;
            }
            System.out.println("press 1 for continue or 0 to stop");
            input=sc.nextInt();
        }
        System.out.println("positives "+positive);
        
        System.out.println("negative "+negative);
        
        System.out.println("zeros "+zeros);
        
    }
}