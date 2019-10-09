/*
 * File: BenchmarkTimer.java
 * Author: Bacchus Jackson
 * Date: September 30, 2019
 * Purpose: This class demonstrates the use of inheritance. The program will create two different
 *          types of loggers and demonstrate the print function with both.
 */

package umuc.bacchusjackson;

public class Main {

    public static void main(String[] args) {

        // Create a Logger Object
        Logger logger = new Logger();

        // Prints Message
        logger.print("This is a message from the Logger Class");

        // Create a Warning Logger Object
        WarningLogger wLogger = new WarningLogger();

        // Prints message with WARNING prepended to it
        wLogger.print("This is warning message from the Warning Logger subclass");
        wLogger.print("This is a second warning message");

        logger.print("This is a regular log message");

        // Prints the number of log and warning messages
        System.out.println(logger.toString());
        System.out.println(wLogger.toString());

    }
}
