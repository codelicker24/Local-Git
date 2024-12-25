import java.util.Scanner;
public class program3a {
    public static void main(String[] args){
        int i,a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        a= obj.nextInt();
        boolean flag=true;
        for(i=2;i<a;i++){
            if(a%i==0){
                flag = false;//assigning
            }}
            if(flag==true){
                System.out.println(a+"prime no");//checking

        }
        else{
            System.out.println(a+"not prime");
        }
    }

}
//running w/o for loop too


