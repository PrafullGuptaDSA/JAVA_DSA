import java.util.HashSet;
class Recurrsion14{
    public static void subSequences(String str,int idx,String newsString,HashSet<String> set) {
        if(idx==str.length()){
            if(set.contains(newsString)){
                return;
            }
            else{
                System.out.println(newsString);
                set.add(newsString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        
        //tobe

        subSequences(str, idx+1, newsString+currChar,set);


        // not to be
        subSequences(str, idx+1, newsString,set);
        
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subSequences(str, 0, "",set);

        
    }

}