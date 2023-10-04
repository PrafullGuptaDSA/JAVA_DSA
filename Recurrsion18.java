class Recurrsion18{
    public static int placeTiles(int n,int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlacement=placeTiles(n-m, m);

        //hrizontal
        int hrizontalPlacements=placeTiles(n-1, m);
        return vertPlacement+hrizontalPlacements;
        
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println( placeTiles(n, m));
    }
}