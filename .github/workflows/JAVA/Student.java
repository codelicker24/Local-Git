public class Student{
    int age;
    char grade;
    String name;
}
public class Main{
    public static void main(String[] args){
        //creating an object of the student class
        Student student1 = new Student();
        student1.name="john";
        student1.age=56;
        student1.grade='a';
        System.out.println(student1.name);
    }

}
