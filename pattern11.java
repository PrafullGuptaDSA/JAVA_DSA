class pattern11{
    public static void main(String args[]) {
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=(m-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                // hollow rombus
                // if(i==1 || j==1  || m==i || j==m){
                    // comple rombus
                System.out.print("*");
                // }
                // else{
                //     System.out.print(" ");
                // }
            }
        System.out.println();
        }
        
    }
}