class Student{
    String name;
    int age;
    public void printStudent(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){//by parameter called
        this.name=name;
        this.age=age;
    }
}
public class Parameterconstructor{
    public static void main(String[] args) {
        Student s1=new Student("aman",24);  //student() is a construtor
        // s1.name="aman";
        // s1.age=24;
        s1.printStudent();

    }
}