class pattern16{
    public static void main(String args[]) {
        int m=10;
        for(int i=1;i<=m;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=m-i+1;j++){
                System.out.print(i +" ");
            }
            
            System.out.println();
        }

            
        
        
    }
}