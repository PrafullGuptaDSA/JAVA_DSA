import java.util.Scanner;

class Strings4{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int countLatter=0;
        String names[]=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();
            countLatter += names[i].length();
        }
        System.out.println(countLatter);
    }
    
}