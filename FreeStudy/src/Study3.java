class C1 {
    static int static_variable = 1;
    int instance_variable = 2;

    static void static_static() {
        System.out.println(static_variable);
    }

    static void static_instance() {
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
        // System.out.println(instance_variable);


    }

    void instace_static() {
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }

    void instance_instance() {
        System.out.println(instance_variable);
    }
}
public class Study3 {
    public static void main(String[] args) {
        C1 c = new C1();

        c.static_static();


        c.static_instance();

        c.instace_static();

        c.instance_instance();

        C1.static_static();

        C1.static_instance();

        // 클래스를 이용해서 인스턴스 메소드에 접근할 수 없음
        // C1.instance_static();

        // 클래스를 이용해서 인스턴스 메소드에 접근할 수 없음
        // C1.instance_instance();

        // final로 선언되면 변경할 수 없다.
        final int a = 1;
    }
}
