class Recurrsion4{
    public static void printFabonacci(int a, int b,int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFabonacci(b, c, n-1);

        
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFabonacci(a, b, n-2);
        
    }
    
}