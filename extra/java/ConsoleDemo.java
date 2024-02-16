public class ConsoleDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Loading");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500); // Simulate some work
            System.out.print(".");
        }
        System.out.println("\nLoading complete!");
    }
}
