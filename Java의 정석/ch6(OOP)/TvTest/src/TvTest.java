class Tv {
    // Tv의 멤버변수
    String color;
    boolean power;
    int channel;

    //Tv의 메서드
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

        }

public class TvTest {
    public static void main(String[] args) {
        Tv t; // Tv 인스턴스를 참조하기위한 변수 t를 선언
        t = new Tv(); // Tv 인스턴스 생성한 후, 그 주소를 t에 저장

        t.channel = 7;
        t.channelUp();
        System.out.println("현재 채널은 : " + t.channel + " 입니다.");
        System.out.println(t); // t가 가지고 있는 주소를 출력
    }
}
