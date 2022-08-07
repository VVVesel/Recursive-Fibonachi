package stackAndQueuesExe;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class O3MaximumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] command = Arrays.stream(console.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int commandType = command[0];

            switch (commandType){

                case 1:
                    stack.push(command[1]);
                    break;
                    case 2:
                        stack.pop();
                        break;
                        case 3:
                            System.out.println(Collections.max(stack));
                            break;

            }
        }
    }
}
