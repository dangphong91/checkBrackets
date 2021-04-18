import java.util.*;

public class checkBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        Stack<Character> bracket = new Stack<>();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        boolean test = true;
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == '(') {
                bracket.push('(');
            }
            if (check.charAt(i) == ')') {
                if (bracket.isEmpty()) {
                    test = false;
                    break;
                }
                else {
                    right.push(bracket.pop());
                    left.push(')');
                }
            }
        }
        if (!bracket.isEmpty()) {
            test = false;
        }
        else {
            if (left.size() != right.size()) {
                test = false;
            }
        }
        if (test) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }
}
