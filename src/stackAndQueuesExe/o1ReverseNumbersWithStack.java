package stackAndQueuesExe;

import java.util.ArrayDeque;
import java.util.Scanner;

public class o1ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers ){
            stack.push(Integer.parseInt(number));
        }
        for (Integer element : stack){
            System.out.printf("%s ", stack.pop());
        }


    }
}
