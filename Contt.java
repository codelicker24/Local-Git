public class Contt {
    //instance variables of the class
    int id;
    String name;


Contt() //zero parameterised constructor bcz andar khali h
{
    System.out.println("this a default constructor ");

}

Contt(int i,String n)
{
    id = i;
    name = n;
}

public static void main(String[] args){
    //object creation
    Contt s1= new Contt();
    System.out.println("\n Default Constructor");
    System.out.println("Student Id:"+s1.id+"\nStudent name:"+s1.name);
    System.out.println("Parameterised constructor value");
   
}
}


