class Strings3{
    public static void main(String args[]) {
        String sentence="My Name Is ROCKY";
        // SUB STRING
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);
        String  sentence2="rockstar";
        System.out.println(sentence2.substring(0,4));
        
        System.out.println(sentence2.substring(4,sentence2.length()));
        
    }
}