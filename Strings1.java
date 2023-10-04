class Strings1{
    public static void main(String args[]) {
        // concatenation
        String firstName= "rock";
        String lastName= "star";
        String fullName=firstName+"@"+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        // charAt
        for(int i=0;i<fullName.length();i++){
        System.out.println(fullName.charAt(i)); 
        }

        
    }
    
}