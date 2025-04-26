// FinalClassDemo.java

// Final class cannot be extended
final class Logger {
    // Method to print a log message
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// Attempting to extend Logger (This will cause an error if uncommented)
/*
class ExtendedLogger extends Logger { // ERROR: Cannot extend final class
    void logMessage(String message) {
        System.out.println("Extended Log: " + message);
    }
}
*/

public class FinalClassDemo {
    public static void main(String[] args) {
        // Creating an object of the final class
        Logger logger = new Logger();
        logger.logMessage("This is a log message."); // Calling the log method

        // Uncommenting the following will cause an error
        // ExtendedLogger extLogger = new ExtendedLogger();
        // extLogger.logMessage("This is an extended log message.");
    }
}
