import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_Part1 {
    public static void insertionSort(int[] arr) {
        if (arr.length == 1)
            System.out.println(arr[0]);
        else {
            for (int i = arr.length - 1; i >= 1; i--) {
                int min = arr[i];
                int index = i;
                for (int j = i - 1; j >= 0; j--) {
                    while (arr[j] > arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        String arr1 = Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", " ");
                        System.out.println(arr1);
                        arr[j] = temp;
                    }
                }
            }
            String arr2 = Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", " ");
            System.out.println(arr2);
        }
    }
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int n = scanner.nextInt();
        if (n <= 0)
            throw new IllegalArgumentException("số phần tử phải lớn hơn 0 !");
        scanner.nextLine();
        String[] mang = new String[n];
        System.out.println("Nhập vào các phần tử:");
        mang = scanner.nextLine().split(" ");
        int[] arr = new int[n];
        for (int q = 0; q < n; q++) {
            arr[q] = Integer.parseInt(mang[q]);
        }
        insertionSort(arr);
        scanner.close();
    }
}
