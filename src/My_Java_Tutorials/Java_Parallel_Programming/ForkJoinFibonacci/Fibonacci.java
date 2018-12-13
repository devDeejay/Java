package My_Java_Tutorials.Java_Parallel_Programming.ForkJoinFibonacci;

import java.math.BigInteger;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<BigInteger> {

    // The time complexity for this approach is 1.618^n
    // 1.618 is also called as the golden ratio

    final int n;
    Fibonacci(int n) {
        this.n = n;
    }

    @Override
    protected BigInteger compute() {
        if (n <= 1)
            return BigInteger.valueOf(n);

        Fibonacci f1 = new Fibonacci(n - 1);
        f1.fork();                                              // Creating Sub Task
        Fibonacci f2 = new Fibonacci(n -2);
        f2.fork();                                              // Creating Sub Task
        BigInteger f1Answer = f1.join();                        // Getting back the answer of f1
        BigInteger f2Answer = f2.join();                        // Getting back the answer of f2
        return ( f1Answer.add(f2Answer) );                      // Adding both and retuning them
    }

    /*  For Best Performance follow this guidelines for calculate method otherwise there will be performance issues
                Avoid Synchronization
                Do not use shared variables across tasks
                Do not perform blocking IO operations
                Are pure functions
                Are isolated
    */

}
