
import java.util.Scanner;
public class fact{
    public static void main(String[] args){
        int num;
        Scanner sy=new Scanner(System.in);
        num= sy.nextInt();
        int factorial=1;
        for(int i =1;i<=num;i++)
        {
            factorial=factorial*i;
            

        }
        System.out.println("factorial is:"+factorial);
    }

}
