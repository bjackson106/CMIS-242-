/*
 * File: WarningLogger.java
 * Author: Bacchus Jackson
 * Date: September 30, 2019
 * Purpose: This class demonstrates the use of inheritance. This subclass will inherit the print
 *          function from the Parent class Logger
 */
package umuc.bacchusjackson;

class WarningLogger extends Logger{

  private static int numberOfWarnings = 0;

  public WarningLogger() {

  }

  // Print a message with warning prepended to it
  public void print(String Message) {
    System.out.print("[WARNING] ");
    super.print(Message);
    numberOfWarnings++;

  }

  public String toString() {
    return String.format("Number of warnings: %d", numberOfWarnings);
  }
}
