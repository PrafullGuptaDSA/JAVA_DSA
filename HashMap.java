import java.util.*;

import javafx.scene.web.WebHistory.Entry;
class HashMap1{
    public static void main(String[] args) {
        // country(key), population (value)
        HashMap<String, Integer> map=new HashMap<>();
        map.put("india",120);
        map.put("china",130);
        map.put("us",140);
        map.put("uk",150);
        // System.out.println(map);
        // map.put("india",150);
        // System.out.println(map);
        // //search
        // if(map.containsKey("china")){
        //     System.out.println("yes true");

        // }
        // else{
        //     System.out.println("no ,false");
        // }
        // System.out.println(map.get("china"));
        // System.out.println(map.get("indonesia"));

// iterator
        // int arr[]={12,15,18};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int value: arr){
        //     System.out.print(value+" ");
        // }
        // System.out.println();

        // for(Map.Entry<String,Integer> mapSet:map.entrySet()){
        //     System.out.println(mapSet.getKey());
        //     System.out.println(mapSet.getValue());

        // }
        // // 2nd type 
        // Set<String> keys=map.keySet();
        // for(String key:keys){
        //     System.out.println(key+" "+map.get(key));
        // }

        //remove
        map.remove("china");
        System.out.println(map);
        
    }
}