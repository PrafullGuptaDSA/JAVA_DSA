class Recurrsion5{
    public static int printPower(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPowernm1=printPower(x,n-1);
        int xPown= x * xPowernm1;
        return xPown;
        
    }
    public static void main(String[] args) {
        
        int ans=printPower(2, 5);
        System.out.println(ans);
        
    }
}