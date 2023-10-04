import java.util.*;
class table{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int table=0;
        for(int i=1;i<=10;i++){
            table=a*i;
            System.out.println(table);
        }
        
    }
}