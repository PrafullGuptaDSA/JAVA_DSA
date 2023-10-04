class Recurrsion6{
    public static int printPow(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // if n is even
        if(n%2==0){
            return printPow(x, n/2)*printPow(x, n/2);
        }
        else{
            // n is odd
            return printPow(x, n/2)*printPow(x, n/2)*x;
        }
        
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=printPow(x, n);
        System.out.println(ans);
        
    }
}