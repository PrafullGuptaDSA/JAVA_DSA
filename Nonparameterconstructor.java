class Student{
    String name;
    int age;
    public void printStudent(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor called");
    }
}
public class Nonparameterconstructor{
    public static void main(String[] args) {
        Student s1=new Student();  //student() is a construtor
        s1.name="aman";
        s1.age=24;
        s1.printStudent();

    }
}