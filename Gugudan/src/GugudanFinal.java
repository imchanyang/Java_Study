import java.util.Scanner;

public class GugudanFinal {
    // 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
    // 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
    // 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
    public static void main(String[] args){
        // 문자열로 사용자가 입력한 값을 받는다.
        System.out.print("구구단을 구성할 숫자 2개를 입력하세요(예시 8,7) : ");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        System.out.println(inputValue);
        // ,를 기준으로 값을 분리해 저장한다.
        String[] splitedValue = inputValue.split(",");

        // 분리되었는지 확인
        System.out.println(splitedValue[0]);
        System.out.println(splitedValue[1]);

        // 정수형으로 변환
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        // 정수형 변환 확인
        System.out.println(first);
        System.out.println(second);

        System.out.println("--------------------------");
        // 2중 for문을 활용해서 문제해결
        for(int i = 2; i <= first; i++) {
            int[] result = new int[second];

            for(int j = 0; j < second; j++) {
                result[j] = i * (j+1);
            }

            System.out.println("----------------" + i + "단-----------------");
            for(int k = 0; k < second; k++) {
                System.out.println(result[k]);
            }
        }



    }
}
