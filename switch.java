import java.util.*;
class switchs{
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch (button) {
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjure");
            break;
            default: System.out.println("invalid input");
                
        }
        
    }
}