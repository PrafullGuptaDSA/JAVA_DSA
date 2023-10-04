class StringsBuilder{
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Prafull");
        System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // //set char at index
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);
        sb.insert(3, 'F');
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);
    }
    
}