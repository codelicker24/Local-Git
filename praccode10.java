public class praccode10 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        for(int i=0;i <arr.length;i++)
        {
            arr[i]= arr[i]*2;
            arr[i]= arr[i] + 1;

        }
        System.out.println(arr[3]); // first it will be 8 and then after 2nd statement in the for loop it will become 8+1 =9


    }

}
