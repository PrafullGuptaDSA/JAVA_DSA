import java.util.Scanner;

class Strings{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        System.out.println("Enter a string..");
        String original=sc.next();
        String compareStrings="";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e'){
                compareStrings +='i';
            }
            else{
                compareStrings += original.charAt(i);
            }
        }
        System.out.println(compareStrings);

        
    }
}