import java.util.Arrays;
import java.util.Scanner;

public class w4_25021765 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bài báo:");
        int news = scanner.nextInt();
        System.out.println("Nhập vào số trích dẫn từng bài báo:");
        int[] citationCount = new int[news];
        for (int n = 0; n < news; n++) {
            citationCount[n] = scanner.nextInt();
        }
        Arrays.sort(citationCount);
        int hIndex = 0;
        for (int i = 0; i < news; i++) {
            int count = news - i;
            if (citationCount[i] >= count) {
                hIndex = count;
                break;
            }
        }
        System.out.println("Chỉ số H-Index là: " + hIndex);
        scanner.close();
    }
}