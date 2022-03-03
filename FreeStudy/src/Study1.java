import java.util.Scanner;

public class Study1 {

    public static void print() {
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i);
        }
    }

    public static void avg(int a, int b) {
        System.out.println((a+b)/2);
    }

    public static void sum(int a, int b) {
        System.out.println((a+b));
    }
    public static void main(String[] args) {
        /*
        여기는 자유롭게 문법을 공부하기 위해 만들었습니다.
         */
        long a = 12314512L;
        float b = 12.3F;

        System.out.println(a + " " + b);

        String a_ = "Hello World";
        String b_ = "Hello World";
        String c_ = "Hello World!";

        if(a_.equals(b_)) {
            System.out.println("굳");
        }
        if(a_.equals(c_)) {
            System.out.println("굳");

        } else {
            System.out.println("안굳");
        }

        String[] classGroup = {"홍길동", "홍길하", "이순신"};
        System.out.println(classGroup[1]);


        String[] classGroup_ = new String[4];
        classGroup_[0] = "홍길동";
        classGroup_[1] = "홍길하";
        classGroup_[2] = "이순신";
        classGroup_[3] = "임꺽정";

        System.out.println(classGroup_[1]);

        for (String z : classGroup_) {
            System.out.println(z);
        }


        print();
        print();
        print();
        print();



        System.out.println();
        System.out.println(args.length);

        sum(10,20);
        avg(10,20);
    }
}
