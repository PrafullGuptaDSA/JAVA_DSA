class Student{
    String name;
    int age;
    public void printStudent(String name){
        System.out.println(name);
    }
    public void printStudent(int age){
        
        System.out.println(age);
    }
    public void printStudent(String name,int age){
        System.out.println(name+" "+age);
    }
    }

public class Polymorphism{
    public static void main(String[] args) {
        Student s1=new Student();  //student() is a construtor
        s1.name="aman";
        s1.age=24;
        s1.printStudent(s1.name, s1.age);

    }
}