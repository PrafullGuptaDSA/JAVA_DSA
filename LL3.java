import java.util.*;

class LL3{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==7){
                System.out.println(i);                
            }

        }
    }
}