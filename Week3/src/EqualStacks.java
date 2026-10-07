import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
    public static int sumChecking(Stack<Integer> bracket){
        int res = 0;
        for (int item : bracket) {
            res += item;
        }
        return res;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng đĩa từng chồng:");
        String[] mang = scanner.nextLine().split(" ");
        String[] chong1 = new String[Integer.parseInt(mang[0])];
        String[] chong2 = new String[Integer.parseInt(mang[1])];
        String[] chong3 = new String[Integer.parseInt(mang[2])];
        System.out.println("Nhập vào độ dày từng đĩa chồng 1:");
        chong1 = scanner.nextLine().split(" ");
        System.out.println("Nhập vào độ dày từng đĩa chồng 2:");
        chong2 = scanner.nextLine().split(" ");
        System.out.println("Nhập vào độ dày từng đĩa chồng 3:");
        chong3 = scanner.nextLine().split(" ");
        Stack<Integer> bracket1 = new Stack<>();
        Stack<Integer> bracket2 = new Stack<>();
        Stack<Integer> bracket3 = new Stack<>();
        for (int j = Integer.parseInt(mang[0]) - 1; j >= 0; j--){
            bracket1.push(Integer.parseInt(chong1[j]));
        }
        for (int q = Integer.parseInt(mang[1]) - 1; q >= 0; q--){
            bracket2.push(Integer.parseInt(chong2[q]));
        }
        for (int k = Integer.parseInt(mang[2]) - 1; k >= 0; k--){
            bracket3.push(Integer.parseInt(chong3[k]));
        }
        while (!(sumChecking(bracket1) == sumChecking(bracket2)) || !(sumChecking(bracket1) == sumChecking(bracket3)) || !(sumChecking(bracket3) == sumChecking(bracket2))) {
            if (sumChecking(bracket1) > sumChecking(bracket2) && sumChecking(bracket1) > sumChecking(bracket3))
                bracket1.pop();
            else if (sumChecking(bracket2) > sumChecking(bracket1) && sumChecking(bracket2) > sumChecking(bracket3))
                bracket2.pop();
            else if (sumChecking(bracket3) > sumChecking(bracket1) && sumChecking(bracket3) > sumChecking(bracket2))
                bracket3.pop();
        }
        System.out.println("Độ cao chung lớn nhất của các chồng đĩa:");
        System.out.println(sumChecking(bracket1));
    }
}
