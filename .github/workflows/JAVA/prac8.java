public class prac8 {
    //trace the code
    public static void main(String[] args) {
        
    
    int[] arr={10,20,30};
    for(int x:arr){ // this statement is discarded, it will just print the value, to change value you must  use for loop
        x=x+5; // for each loop will discard this statement 
        System.out.println(arr[1]);// why isnt 20 incrementing by 5 and why is it printed 3 times is x an iteration variable
    } // how many elements in array that many times for each gets printed
System.out.println(arr[0]);// wont get updated to 15
    }
}
// for each loop only displays the wvalue doesnt perform any operations 
//for(x=0,x<arr[x];x++)// why arr[x] in test condition? isnt arr[x] just value?