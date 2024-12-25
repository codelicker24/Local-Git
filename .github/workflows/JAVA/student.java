// Basic Class and Object
class Student {
    // Instance variables
    private String name;
    private int age;
    
    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

// Inheritance
class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }
}

class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I teach " + subject);
    }
}  
