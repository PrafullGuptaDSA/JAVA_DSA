class Recurrsion3{
    public static int printFact(int n) {
        if(n==1 || n==0){
            return 1;
        }
        int nm1=printFact(n-1);
        int fact=n*nm1;
        return fact;

        
    }
    public static void main(String[] args) {
       int ans= printFact(0);
       System.out.println(ans);
        
    }
}