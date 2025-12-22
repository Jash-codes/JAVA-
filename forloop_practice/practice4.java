public class practice4 {
    // countdown
    public static void main(String[] args) {
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);

                Thread.sleep(1000);
            }
            System.out.println("Lets Goooo");

        } catch (InterruptedException e) {

            System.err.println("The countdown was interrupted");
        }

    }
}
