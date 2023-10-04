import javax.print.attribute.Size2DSyntax;

class Strings2{
    public static void main(String args[]) {
        // concatenation
        String name= "rock";
        String name1= "rock";
        // compare
        // 1.s1>s2 => +ve
        // 2.s1=s2=>0
        // 3.s1<s3=> -ve

        // hello or cello=> here hello is greater because first letter is h compare with c so h has high value.

        if(name.compareTo(name1)==0){
            System.out.println("strings are equal.");
        }
        else{
            System.out.println("strings are not equal.");
        }


        
    }
    
}