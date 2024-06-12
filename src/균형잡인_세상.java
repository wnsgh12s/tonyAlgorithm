import java.util.*;

public class 균형잡인_세상 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                    balanced = false;
                    break;
                }
                if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                    balanced = false;
                    break;
                }
            }

            if (!stack.isEmpty()) {
                balanced = false;
            }

            System.out.println(balanced ? "yes" : "no");
        }
    }
}
