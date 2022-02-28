// 사용자 입력을 위해 사용하는 클래스
import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args){
        // 4단(변수에 저장하고 출력)
        int result = 4 * 1;
        System.out.println(result);
        result = 4 * 2;
        System.out.println(result);
        result = 4 * 3;
        System.out.println(result);
        result = 4 * 4;
        System.out.println(result);
        result = 4 * 5;
        System.out.println(result);
        result = 4 * 6;
        System.out.println(result);
        result = 4 * 7;
        System.out.println(result);
        result = 4 * 8;
        System.out.println(result);
        result = 4 * 9;
        System.out.println(result);

        System.out.println("-----------반복문----------");

        // 4단(반복문, 변수에 저장해서 출력)
        for(int i = 1; i < 10; i++) {
            result = 4 * i;
            System.out.println(result);
        }

        System.out.println("----------사용자 입력을 받아서 구구단 출력-------------");
        // 사용자 입력을 받아서 구구단 만들기
        // println 대신 print 사용 : println은 개행을 한다.
        System.out.print("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        System.out.println(number * 6);
        System.out.println(number * 7);
        System.out.println(number * 8);
        System.out.println(number * 9);

        System.out.println("----------반복문을 사용해서 입력을 받은 구구단 출력----------");
        // 사용자 입력을 받아서 구구단 만들기(반복문)
        System.out.print("구구단 중 출력할 단은? : ");
        number = scanner.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(number * i);
        }
    }
}
