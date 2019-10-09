/*
 * File: Logger.java
 * Author: Bacchus Jackson
 * Date: September 30, 2019
 * Purpose: This class demonstrates the use of inheritance. This class can be extended.
 */

package umuc.bacchusjackson;

import java.util.Date;

class Logger {

  private static int numberOfMessages = 0;
  private Date clock = new Date();

  public Logger() {

  }

  // Simply Print a Message with a time stamp
  public void print(String message) {

    System.out.print(clock.toString() + " - ");
    System.out.println(message);
    numberOfMessages++;
  }

  public String toString() {

    return String.format("Number of Messages: %d", numberOfMessages);
  }

}
