// Define an interface EventHandler
interface EventHandler {
    void handleEvent();
}

// Main class
class EventDemo {
    // Method demonstrating a local inner class
    public void registerEvent() {
        // Local Inner Class
        class LocalEventHandler implements EventHandler {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }

        // Creating an instance of the local inner class and calling the method
        LocalEventHandler localHandler = new LocalEventHandler();
        localHandler.handleEvent();
    }
}

// Separate main class
public class Main {
    public static void main(String[] args) {
        EventDemo eventDemo = new EventDemo();

        // Demonstrating local inner class
        eventDemo.registerEvent();

        // Demonstrating anonymous inner class
        EventHandler anonymousHandler = new EventHandler() {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };

        // Calling the method using anonymous inner class
        anonymousHandler.handleEvent();
    }
}
