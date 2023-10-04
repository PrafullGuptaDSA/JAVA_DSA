class pattern10{
    public static void main(String args[]) {
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                // if(j==i || i==j || i==1 || j==1 ){
                System.out.print("*");}
                // else{
                    // System.out.print(" ");
                // }
            // }
            for(int j=1;j<=2*(m-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                // if(j==i || i==j || i==1 || j==1 ){
                System.out.print("*");}
            //     else{
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=i;j++){
                // if(j==i || i==j || i==1 || j==1 ){
                System.out.print("*");}
            //     else{
            //         System.out.print(" ");
            //     }
            // }
            for(int j=1;j<=2*(m-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                // if(j==i || i==j || i==1 || j==1 ){
                System.out.print("*");
            // }
            //     else{
            //         System.out.print(" ");
            //     }
            }
            System.out.println();
        }
        //  for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=2*(m-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
    }
}