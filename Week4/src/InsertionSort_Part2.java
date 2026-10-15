import java.io.*;
import java.util.*;
    public class InsertionSort_Part2 {
        public static void insertionSort2(int n, List<Integer> arr) {
            // Lặp qua từ phần tử thứ 2 (chỉ số 1) đến cuối mảng
            for (int i = 1; i < n; i++) {
                int key = arr.get(i);
                int j = i - 1;

                // Dời các phần tử lớn hơn key sang phải 1 vị trí
                while (j >= 0 && arr.get(j) > key) {
                    arr.set(j + 1, arr.get(j));
                    j--;
                }

                // Chèn key vào vị trí thích hợp
                arr.set(j + 1, key);

                // In toàn bộ mảng ra trên một dòng sau mỗi bước chèn
                for (int k = 0; k < n; k++) {
                    System.out.print(arr.get(k) + (k == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            // Đọc số lượng phần tử n
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            // Đọc danh sách phần tử
            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            // Gọi hàm giải bài toán
            insertionSort2(n, arr);

            bufferedReader.close();
        }
    }
