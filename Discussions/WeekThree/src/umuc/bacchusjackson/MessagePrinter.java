/*
 * File: MessagePrinter.java
 * Author: Bacchus Jackson
 * Date: October 13, 2019
 * Purpose: This class simply prints a message and calls the next message printer method.
 *          the purpose is to demonstrate Exception Propagation. the printFirstMethod()
 *          can have a try-catch block to catch exceptions thrown later in the call stack.
 *          The runtime system will travel up the call stack in reverse order until it can
 *          find something to handle the exception. NOTE: Dividing by zero is an example of
 *          an unchecked exception.
 */
package umuc.bacchusjackson;

public class MessagePrinter {

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
    printThirdMessageThrowException();
  }

  public void printThirdMessageThrowException() {
    System.out.println("[printThirdMessageThrowException] was called in printSecondMessage()");
    System.out.println("I'm going to divide by Zero");
    double testNum = 25/0;

  }

}
