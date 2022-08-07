import java.util.Scanner;

public class O6RecursiveFibonacci {
    public static long[] memory;
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        memory = new long[n + 1];
        if ( n == 0 ){
            System.out.println(0);
            return;
        }


            long result = fib(n);
        System.out.println(result);
    }
    private  static long fib(int n){
        if ( n < 2 ){
        return 1;
        }
        if ( memory[n] != 0){
                return memory[n];
        }
        memory[n] = fib(n - 1) + fib(n - 2);
        return memory[n];
    }
}
//Each member of the Fibonacci sequence is calculated from the sum of the two previous members.
// The first two elements are 1, 1. Therefore, the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34…
//The following sequence can be generated with an array,
// but that’s easy, so your task is to implement it recursively.
//If the function getFibonacci(n) returns the nth Fibonacci number,
// we can express it using getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).
//However, this will never end and in a few seconds,
// a Stack Overflow Exception is thrown. For the recursion to stop, it has to have a "bottom".
// The bottom of the recursion is getFibonacci(1), and should return 1. The same goes for getFibonacci(0).
//Input
//•	On the only line in the input, the user should enter the wanted Fibonacci number N where 1 ≤ N ≤ 49.
//Output
//•	The output should be the nth Fibonacci number counting from 0