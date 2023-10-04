class pattern2{
    public static void main(String args[]){
        int m=10;
        int n=10;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}