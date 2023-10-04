class Recurrsion10{
    public static boolean checkIncresingOrder(int arr[],int idx) {
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
           return checkIncresingOrder(arr, idx+1);

        }
        else{
            return false;
        }
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5};
        System.out.println(checkIncresingOrder(arr, 0));
        
    }
}