import java.util.Scanner;

public class Gugudan4 {
    public static void main(String[] args) {
        // 조건문과 반복문을 활용한 구구단
        System.out.print("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("사용자가 입력한 값 : " + number);

        // 조건문 - if
        if(number < 2) {
            System.out.println("값을 잘못 입력하셨습니다.");
        }
        else if (number > 9){
            System.out.println("값을 잘못 입력하셨습니다.");
        }
        else {
            System.out.println("-----------구구단 출력---------");
            for(int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}
