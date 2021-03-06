public class MemberCall {
    int iv  = 10;
    static int cv = 20;

    // 변수
    int iv2 = cv;
    // static int cv2 = iv; : 클래스 변수는 인스턴스를 생성하기전에 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCall().iv; // 이렇게 객체를 생성해야 사용가능.

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); :클래스 메서드에서 인스턴스를 생성하기전에  인스턴스 변수 사용불가.
        MemberCall c = new MemberCall();
        System.out.println(c.iv); // 인스턴스를 생성한 후, 인스턴스 변수 사용가능.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수 사용가능.
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); : 클래스 메서드 인스턴스를 생성하기전에 인스턴스 메서드 사용불가.
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 인스턴스를 생성한 후, 인스턴스 메서드 사용가능.

    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1(); // 인스턴스 메서드에서는 인스턴스 변수 사용가능.
    }

    void instanceMethod3() {
        staticMethod1();
        staticMethod2();
        instanceMethod1();
        instanceMethod2();
    }


}
