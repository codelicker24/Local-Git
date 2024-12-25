// 1. If-Else Statements
public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;
        
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}

// 2. Loops
public class LoopsExample {
    public static void main(String[] args) {
        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        // While loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        
        // Do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
    }
}
