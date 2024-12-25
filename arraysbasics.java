import java.util.Scanner;
public class arraysbasics {
    public static void main(String[] args) {
        //we are declaring scanner object beforehand, ek hi baar kaafi h likhna the below statement even if you have to input multiple numbers
        Scanner sy= new Scanner(System.in);
        //asking the user for the size of the array
        System.out.print("enter the size of the array");
        int size= sy.nextInt();
        int[] array= new int[size];
        //taking input from user
        System.out.println("enter"+size+"elements");
        for (int i=0;i<size;i++){
            array[i]=sy.nextInt();

        }
        //display the elements of the array
        System.out.println("the elements of the array are");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        //closing the scanner
        //is closing the scanner necessary?ans no
        // why is array elements printing line by line w/o /n
 
    }

}
