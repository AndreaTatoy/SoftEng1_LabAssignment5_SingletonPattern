package LabAssignment5;

public class QueueManager {
    private static QueueManager instance;
    private int currentQueueNumber;

    private QueueManager() {
        currentQueueNumber = 0;
    }

    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public synchronized int getQueueNumber() {
        return ++currentQueueNumber;
    }

    public synchronized void resetQueueNumber(int resetNumber) {
        currentQueueNumber = resetNumber;
        
        System.out.println("Queue number reset to: " + resetNumber);
    }
}
