public class Gugudan6 {
    // 메소드를 사용해서 구구단 구현
    public static int[] calculate(int times) {
        int [] result = new int[9];

        for(int i = 0; i < result.length; i++) {
            result[i] = times * (i+1);
        }
        return result;
    }

    public static void print(int[] result) {
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("------------2단---------------");
        int[] result2 = calculate(2);
        print(result2);

        System.out.println("------------3단---------------");
        int[] result3 = calculate(3);
        print(result3);

        System.out.println("------------4단---------------");
        int [] result4 = calculate(4);
        print(result4);


        System.out.println("---------------반복문-----------------");
        // 메소드 + 반복문을 활용해서 더 줄이기
        for(int i = 2; i < 10; i++) {
            System.out.println("---------" + i + "단---------------");
            int[] result = calculate(i);
            print(result);
        }


    }
}
