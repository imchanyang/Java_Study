import java.sql.SQLOutput;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        // 향상된 for문
        for(int tmp : arr) {
            System.out.printf("%d ", tmp);
        }
        System.out.println();
    }
}
