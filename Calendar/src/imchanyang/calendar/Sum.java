package imchanyang.calendar;
import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        // 키보드로 두 수를 입력받아서 두 수의 합을 출력
        System.out.println("두 수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("두 수의 합은 " + (first + second) + " 입니다.");
        System.out.printf("두 수의 합은 %d 입니다.", (first+second));

        scanner.close();
    }
}
