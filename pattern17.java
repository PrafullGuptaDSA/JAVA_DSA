class pattern17{
    public static void main(String args[]) {
        int m=5;
        int number=1;
        for(int i=0;i<=m-1;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            int number1=1;
            for(int j=0;j<=i;j++){
                System.out.print(number1 +" ");
                number1=number1*(i-j)/(j+1);
            }
            System.out.println();
        }
        
    }
}