class Tv {
    // Tv의 멤버변수
    String color;
    boolean power;
    int channel;

    // Tv의 메서드
    void power() {
        power = ! power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // Tv = t1; t1 = new Tv(); 한문장으로 표현
        Tv t2 = new Tv();

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        t1.channel = 7;
        t2.channel = 8;

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        t2 = t1; // t1이 저장하고 있는 값(주소)를 t2에 저장한다.
        t1.channelDown(); // t1에 저장되어 있는 주소(객체) 값이 변경, 따라서 t2도 같은 주소를 참조하고 있어서 아래와 같은 결과가 나온다.

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        // 같은 주소값을 저장하고 있다.
        // 원래 t2가 가리키고 있던 인스턴스는 garbage collector에 의해 메모리에서 제거된다.
        System.out.println(t1);
        System.out.println(t2);
    }
}
