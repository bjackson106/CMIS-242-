/*
 * File: Main.java
 * Author: Bacchus Jackson
 * Date: May 31, 2019
 * Purpose: This program is to test the benchmark class. There is no expected input. The result
 *          should be two fake tasks being conducted and timed. The total number of timers and
 *          total time elapsed should be printed to the console.
 */

package umuc.bacchusjackson;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Instantiate a BenchmarkTimer object which starts it automatically
        BenchmarkTimer timer1 = new BenchmarkTimer();

        // Simulate a task taking time
        System.out.println("[Main] Executing Task 1 ...");
        TimeUnit.SECONDS.sleep(6);
        System.out.println("[Main] Task 1 complete!");

        // Stop the timer
        timer1.stop();

        // Print the result
        timer1.printResult();

        BenchmarkTimer timer2 = new BenchmarkTimer();

        // Simulate another task taking time
        System.out.println("[Main] Executing Task 2 ...");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("[Main] Executing Task 2 ...");

        // Stop the timer
        timer2.stop();

        // Print the Results
        timer2.printResult();

        // Print Total time and Total Timers
        BenchmarkTimer.printEndResults();

    }
}
