
 class Rectangle {
    private double length;
    private double width;

    //constructor
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    //method to calculate area
    public double getArea(){
        return length * width;
    }
    //method to calculate perimeter
    public double getPerimeter(){
        return 2*(length+width);
    }
    //method to display rectangle information
    public void displayInfo(){
        System.out.println("rectangle[length:"+length+",width:"+width+"]");
        System.out.println("area:"+getArea());
        System.out.println("perimeter"+getPerimeter());
    }
}

public class Main{
    public static void main(String[] args){
        //create two rectangle objects
        Rectangle rect1= new Rectangle(5,3);
        Rectangle rect2= new Rectangle(7,4);
    
    // Displaying information for each rectangle
    System.out.println("rectangle 1:");
    rect1.displayInfo();
    System.out.println("rectangle 2");
    rect2.displayInfo();
}
}
