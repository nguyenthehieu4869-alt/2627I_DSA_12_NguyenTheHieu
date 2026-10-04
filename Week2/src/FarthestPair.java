import java.util.Arrays;
import java.util.Scanner;

public class FarthestPair {
    public static double[] findFarthestPair(double[] nums){
        if (nums == null || nums.length < 2)
            return new double[0];
        else {
            Arrays.sort(nums);
            int left = 0;
            int right = nums.length - 1;
            while (left < right){
                double temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return new double[]{nums[nums.length-1], nums[0]};
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        int n = scanner.nextInt();
        double[] nums = new double[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhập vào giá trị phần tử thứ " + (i+1) + " của mảng:");
            nums[i] = scanner.nextDouble();
        }
        double[] pair = findFarthestPair(nums);
        if (pair.length == 2) {
            System.out.println("Cặp số xa nhất:");
            System.out.println(pair[1] + ", " + pair[0]);
        }
        else
            System.out.println("Độ dài mảng phải từ 2 phần tử trở lên !");
    }
}
