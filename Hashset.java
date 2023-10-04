import java.util.Iterator;
import java.util.HashSet;
class Hashset{
    public static void main(String[] args) {
        //creating....
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println("size of set is "+set.size());
        System.out.println(set);

        //search-contains
        // if(set.contains(1)){
        //     System.out.println("set conatains 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("does not contain");
        // }

        // //delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("we deleted 1");
        // }

        //iterator
        Iterator it=set.iterator();
        //hashNext;next function
        while(it.hasNext()){
            System.out.println(it.next());
        }
 


        
    }
}