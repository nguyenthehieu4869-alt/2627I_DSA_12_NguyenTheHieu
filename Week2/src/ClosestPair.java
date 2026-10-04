import java.util.Arrays;
import java.util.Scanner;

public class ClosestPair {
    public static double[] findClosestPair(double[] nums){
        if (nums == null || nums.length < 2)
            return new double[0];
        Arrays.sort(nums);
        double minDiff = Double.MAX_VALUE;
        double num1 = nums[0];
        double num2 = nums[1];
        for (int i = 0; i < nums.length - 1; i++){
            if (Math.abs(nums[i+1] - nums[i]) < minDiff){
                minDiff = Math.abs(nums[i+1] - nums[i]);
                num1 = nums[i];
                num2 = nums[i+1];
            }
        }
        return new double[]{num1, num2};
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng:");
        int n = scanner.nextInt();
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào giá trị thứ " + (i + 1) + " của mảng:");
            nums[i] = scanner.nextDouble();
        }
        double[] pair = findClosestPair(nums);
        if (pair.length == 2) {
            System.out.println("Cặp số gần nhất là:");
            System.out.println(pair[0] + ", " + pair[1]);
        }
        else
            System.out.println("Độ dài mảng phải từ 2 phần tử trở lên !");
    }
}
