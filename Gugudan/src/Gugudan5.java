import java.util.Scanner;

public class Gugudan5 {
    public static void main(String[] args) {
        System.out.println("-------------2단--------------");
        // 2단 배열을 이용한 구구단
        int[] result = new int[9];

        // 배열에 값 저장
        for(int i = 0 ; i < result.length; i++) {
            result[i] = 2 * (i+1);
        }

        // 값 출력
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

        System.out.println("-------------3단--------------");

        // 3단 배열을 이용한 구구단
        result = new int[9];

        // 배열에 값 저장
        for(int i = 0 ; i < result.length; i++) {
            result[i] = 3 * (i+1);
        }

        // 값 출력
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

        System.out.println("-------------4단--------------");

        // 4단 배열을 이용한 구구단
        result = new int[9];

        // 배열에 값 저장
        for(int i = 0 ; i < result.length; i++) {
            result[i] = 4 * (i+1);
        }

        // 값 출력
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }


        System.out.println("-------------2중 for문--------------");
        // 반복을 피하기 위한 2중 for문
        for(int i = 0; i < result.length; i++) {

            // 값 저장
            for(int j = 0; j < result.length; j++) {
                result[i] = (i+1) * (j+1);
            }

            // 값 출력
            System.out.println( "----------------" + (i + 1) + "단----------------");
            for(int k = 0; k < result.length; k++) {
                System.out.println(result[k]);
            }


        }


    }
}
