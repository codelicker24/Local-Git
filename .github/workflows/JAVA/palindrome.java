public class palindrome {
    static int reversednumber(int n){
        int reversed_n=0;
        while(n>0){
            reversed_n=reversed_n*10+n%10;
            n=n/10;
            }
            return reversed_n;
        }
public static void main(String[] args) {
    int n=1234321;
    int reverseN = reversednumber(n);
    System.out.println("reverse no is"+reverseN);
}


}
//incomplete
if(n==reverseN)
