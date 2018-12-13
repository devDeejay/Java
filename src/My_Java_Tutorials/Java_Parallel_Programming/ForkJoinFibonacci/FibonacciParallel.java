package My_Java_Tutorials.Java_Parallel_Programming.ForkJoinFibonacci;

public class FibonacciParallel {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(40);
        System.out.println(fibonacci.compute());
    }
}