package umuc.bacchusjackson;

public class Main {
    public static void main(String[] args) {
        int numberOfNodes = 11;

        //int recursiveTotal = countNodeLinksRecursive(numberOfNodes);

        //System.out.println("Number of Node Links (Recursive): " + recursiveTotal);

        int iterativeTotal = countNodeLinksIterative(numberOfNodes);

        System.out.println("Number of Node Links (Iterative): " + iterativeTotal);
    }

    static int countNodeLinksRecursive(int nodes) {
        if (nodes <=1) {
            return 0;
        }
        if (nodes == 2) {
            return 1;
        }

        return countNodeLinksRecursive(nodes - 1) + (nodes - 1);
    }

    static int countNodeLinksIterative(int nodes) {
        int total = 0;
        for(int i = 1; i < nodes; i++) {
            total = total + (nodes - i);
        }
        return total;
    }
}