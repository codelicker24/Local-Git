import java.util.Scanner;
public class program2a {
    public static void main(String[] args){
        int a,b,c;
        double root1,root2;
        double d;
        System.out.println("enter the coefficients");
        Scanner in= new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = (b*b)-4*a*c;
        System.out.println("determinant="+d);
        if(d>0){
            //two real and distinct roots
            System.out.println("roots are real and distinct");
            root1= (-b + Math.sqrt(d))/(2*a);
            root2= (-b - Math.sqrt(d))/(2*a);
            System.out.println("root1="+root1);
            System.out.println("root2"+root2);
        }
        else if (d==0)
        {
            System.out.println("roots are real and equal");
            root1 = -b/(2*a);
            root2 = -b/(2*a);
            System.out.println("root1="+root1);
            System.out.println("root2="+root2);
        }
        else
        {
            System.out.println("roots are imaginary");
            root1= -b/(2*a);
            root2 = Math.sqrt(Math.abs(d))/(2*a);
            System.out.println("root1="+root1+"+i"+root2);
            System.out.println("root1="+root1+"-i"+root2);
        }
    }

            


        }

        




    


