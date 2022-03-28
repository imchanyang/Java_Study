public class ConstantLiteral {
    public static void main(String[] args) {
        // final int MAX_SPEED;  <- 상수는 선언과 동시에 초기화 해야함
        final int MAX_SPEED = 100;
        // MAX_SPEED = 20; <- 상수의 값은 변경할 수 없음

        // 구문자 '_'를 사용해서 큰 숫자를 읽기 편하게 만들 수 있다
        int big = 100_000_000;

        System.out.println(MAX_SPEED);
        System.out.println(big);

        // float pi = 3.14; <- float 타입 변수에 double 타입 리터럴 저장불가
        double pi = 3.14; 
    }
}
