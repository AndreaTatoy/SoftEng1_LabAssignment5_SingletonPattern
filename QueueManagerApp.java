package LabAssignment5;
import java.util.Scanner;

public class QueueManagerApp {
    public static void main(String[] args) {
        QueueManager queueManager = QueueManager.getInstance();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nOPTIONS:");
            System.out.println("1 - Get queue number");
            System.out.println("2 - Reset queue number");
            System.out.println("3 - Exit");

            System.out.print("\nPlease enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nQueue Number: " + queueManager.getQueueNumber());
                    break;

                case 2:
                    System.out.print("\nEnter the new queue start number: ");
                    int resetNumber = scanner.nextInt();
                    queueManager.resetQueueNumber(resetNumber);
                    break;

                case 3:
                    isRunning = false;
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("\nInvalid option. Please enter only 1, 2, or 3.");
                    break;
            }
        }
        scanner.close();
    }
}
