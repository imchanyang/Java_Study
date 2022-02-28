public class Gugudan {
    public static void main(String[] argg){
        System.out.println("-----------기본 출력문-----------");
        //2단
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9);

        //3단
        System.out.println(3 * 1);
        System.out.println(3 * 2);
        System.out.println(3 * 3);
        System.out.println(3 * 4);
        System.out.println(3 * 5);
        System.out.println(3 * 6);
        System.out.println(3 * 7);
        System.out.println(3 * 8);
        System.out.println(3 * 9);

        System.out.println("-----------반복문-----------");

        //2단(반복문)
        for(int i = 1; i < 10; i++) {
            System.out.println(2 * i);
        }

        //3단(반복문)
        for(int i = 1; i < 10; i++) {
            System.out.println(3 * i);
        }

        System.out.println("-----------반복문2-----------");

        //2단, 3단 (반복문)
        for(int i = 2; i < 4; i++) {
            for(int j = 1; j < 10; j++){
                System.out.println(i * j);
            }
        }
    }
}
