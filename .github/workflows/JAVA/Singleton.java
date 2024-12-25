// Singleton Pattern
public class Singleton {
    private static Singleton instance;
    private String data;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
}

// Factory Pattern
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public Animal getAnimal(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("DOG")) {
            return new Dog();
        }
        if (type.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}
