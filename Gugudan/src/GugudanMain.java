public class GugudanMain {
    // 클래스를 활용한 구구단
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.println("---------" + i + "단---------------");
            int[] result = Gugudan6.calculate(i);
            Gugudan6.print(result);
        }
    }
}
