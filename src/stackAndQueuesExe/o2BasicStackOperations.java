package stackAndQueuesExe;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class o2BasicStackOperations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] input = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).
                toArray();

       int countToPush = input[0];
       int countToPop = input[1];
       int elementToSearch = input[2];

        int[] numbers = Arrays.stream(console.nextLine().split(" "))
                .mapToInt(Integer::parseInt).
                toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countToPush ; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
            if (stack.contains(elementToSearch) ){
                System.out.println("true");
            }
             else if (stack.isEmpty()){
                System.out.println("0");
             }else {
                System.out.println(Collections.min(stack));
            }

        }


    }

