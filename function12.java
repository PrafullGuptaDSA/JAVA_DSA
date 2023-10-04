import java.util.Scanner;

class function12{
    public static void printVoteOrNot(int age) {
        if(age>=18){
        System.out.println("You are eligible for vote");
        return;
        }
        else{
            System.out.println("You are not eligible for vote");
        return;
        
            
        }
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        printVoteOrNot(age);

        
    }
}