/*
 * File: BenchmarkTimer.java
 * Author: Bacchus Jackson
 * Date: September 25, 2019
 * Purpose: This program is to demonstrate the difference between static and instance variables and methods.
 *          This class should be able to print the difference in milliseconds from when it was instantiated
 *          to when the end() method was called and print the results. It should also be able to keep track
 *          of the total number of BenchmarkTimer objects created.
 */

package umuc.bacchusjackson;
import java.util.Date;

class BenchmarkTimer {

  // Declare Static Variable to be shared across all BenchmarkTimer objects
  private static int timersLaunched;
  private static long totalTimeElapsed;

  // Declare Instance Variables to track per object
  private Date startTime;
  private Date stopTime;
  private Long timeElapsedMilliseconds;

  // Constructor
  public BenchmarkTimer() {

    // Increment the tracker
    timersLaunched++;

    // Get the current time
    startTime = new Date();
  }

  // Public method to stop the timer
  public void stop() {
    stopTime = new Date();
    timeElapsedMilliseconds = stopTime.getTime() - startTime.getTime();
    totalTimeElapsed += timeElapsedMilliseconds;

  }

  // Instance Method to print the result to the console
  public void printResult() {

    // Calculate the total time elapsed

    // Print the result to the console
    System.out.printf("[Benchmark Timer] Time elapsed: %d milliseconds \n", timeElapsedMilliseconds);
  }

  // Static Method to print the total time and number of timers
  public static void printEndResults() {
    System.out.printf("[Benchmark Timer] Timers Launched: %d, total Time Elapsed: %d", timersLaunched, totalTimeElapsed);
  }

}