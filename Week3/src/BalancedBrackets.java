import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean checking(char first, char last){
        if ((first == '{' && last == '}') || (first == '[' && last == ']') || (first == '(' && last == ')'))
            return true;
        else
            return false;
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số chuỗi ngoặc:");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập vào chuỗi ngoặc thứ " + (i+1) + ':');
            str[i] = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean bool = true;
            for (char item : str[i].toCharArray()) {
                if (stack.isEmpty() && (item == '}' || item == ']' || item == ')')) {
                    bool = false;
                    break;
                }
                else if (item == '{' || item == '[' || item == '(')
                    stack.push(item);
                else {
                    if (checking(stack.pop(), item) == false) {
                        bool = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty())
                System.out.println("Thứ tự các dấu ngoặc sai !");
            else if (bool == true)
                System.out.println("Thứ tự các dấu ngoặc đúng !");
            else
                System.out.println("Thứ tự các dấu ngoặc sai !");
        }
    }
}
