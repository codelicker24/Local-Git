import java.util.*;
public class ArithmeticOpCalc {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();//statements for input
        int b = sc.nextInt();
        System.out.println("enter 1 for addition, 2 for subtraction, 3 for multiplication,4 for division");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println(a+"+"+b+"="+ (a+b));
            //the first + before a+b is concatenation 
            break;
            //why break? 
            case 2:
            System.out.println(a+"-"+b+"="+ (a-b));
            break;
            case 3:
            System.out.println(a+"*"+b+"="+(a*b));
            break;
            case 4:
            if(b==0)
            System.out.println("the denominator cant be zero");
            else
                System.out.println(a+"/"+b+"="+((double)a/b));
                //ask explation for this line
                //why using double?
                break;
            //we use default when no choice aligns with users choice
            default:
            System.out.println("invalid i/p");


        }
    }

}
