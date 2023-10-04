import java.util.Scanner;

class Strings6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String email=sc.next();
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                System.out.println(email.substring(0, i));
            }
        }
    }
}