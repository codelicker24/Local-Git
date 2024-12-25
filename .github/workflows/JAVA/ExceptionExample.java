// Exception Handling
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
        } finally {
            System.out.println("This always executes");
        }
    }
}

// Multithreading
class MultiThreadingExample extends Thread {
    private String threadName;
    
    public MultiThreadingExample(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        MultiThreadingExample thread1 = new MultiThreadingExample("Thread 1");
        MultiThreadingExample thread2 = new MultiThreadingExample("Thread 2");
        
        thread1.start();
        thread2.start();
    }
}
