class Recurrsion13{
    public static void subSequences(String str,int idx,String newsString) {
        if(idx==str.length()){
            System.out.println(newsString);
            return;
        }
        char currChar=str.charAt(idx);
        
        //tobe

        subSequences(str, idx+1, newsString+currChar);


        // not to be
        subSequences(str, idx+1, newsString);
        
    }
    public static void main(String[] args) {
        String str="abc";
        subSequences(str, 0, "");

        
    }

}