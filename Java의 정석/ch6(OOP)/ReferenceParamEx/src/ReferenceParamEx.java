class Data {
    int x;
}
public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("x_1 = " + d.x);

        change(1000);
        System.out.println("x_3 = " + d.x);

        change2(d);
        System.out.println("x_5 = " + d.x);

    }

    // 기본형 매개변수
    static void change(int x) {
        x = 1000;
        System.out.println("x_2 = " + x);
    }

    // 참조형 매개변수
    static void change2(Data d) {
        d.x = 1000;
        System.out.println("x_4 = " + d.x);
    }
}
