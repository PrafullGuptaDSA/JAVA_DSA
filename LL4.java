import java.util.*;
class LL4{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<=list.size();i++){
            int a=sc.nextInt();  
            // list.addFirst(a); 
            if(a<=50){
                list.addFirst(a);
            }
            else{
                System.out.println(list);    
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=25){
                list.remove(list.get(i));
                System.out.println(list);
            }
        }

        
            
    }
}