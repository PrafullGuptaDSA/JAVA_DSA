interface Animall{
    void walk();
    int eyes=2;
}
interface Hervivore{

}
class Hourses implements Animall,Hervivore{
    public void walk(){
        System.out.println("Hourse has four legs.");
    }

}

class MultipleInheriInterface{
    public static void main(String[] args) {
        Hourses hourse=new Hourses();
        hourse.walk();
        int a=Animall.eyes;
        System.out.println(a);
        
    }
}