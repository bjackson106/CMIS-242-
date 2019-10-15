/*
 * File: MessagePrinterTwo.java
 * Author: Bacchus Jackson
 * Date: October 13, 2019
 * Purpose: This class isn't used because it will not compile if the last function
 *          is uncommented. You can't use code that throws a checked exception without
 *          writing something to handle that exception should one occur.
 */
package umuc.bacchusjackson;

public class MessagePrinterTwo {

  public void printFirstMessage() {
    System.out.println("[printFirstMessage] was called in main()");
    try {
      printSecondMessage();
    } catch (Exception e) {
      System.out.println("Caught The Exception");
    }
  }

  public void printSecondMessage() {
    System.out.println("[printSecondMessage] was called in printFirstMessage()");
    // printThirdMessageThrowException();
  }

/* This method throws an IOException which is checked. This code will not compile unless the try catch block
 * is moved to the printSecondMessage Method!
 *
  public void printThirdMessageThrowException() {
    System.out.println("[printThirdMessageThrowException] was called in printSecondMessage()");
    System.out.println("I'm going to throw an Exception!!");
    throw new java.io.IOException("Custom IO Exception");
  }
  */
}
