import bank;
class Shape{
    public void printArea(){
        System.out.println("print area");
    }
}
//single level
class Tringle extends Shape{
    public void printArea(int l,int h){
        System.out.println(1/2*l*h);
    }
}
//multilevel
class EquilateralTringle extends Tringle{
    public void printArea(int l,int h){
        System.out.println(1/2*l*h);
    }
}
// heirarchical level
class circle extends Shape{
    public void printArea(int r){
        System.out.println(3.14*r*r);
    }
}

class Inheritence{
    public static void main(String[] args) {
        bank.Accout accout1=new bank.Accout();
        accout1.name="customer1";       
    }
}