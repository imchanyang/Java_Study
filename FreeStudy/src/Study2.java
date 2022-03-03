

class Calculator{
    int left, right;
    static double PI = 3.14;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class Study2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c1.setOprands(20,30);
        c1.sum();
        c1.avg();

        System.out.println(c1.PI);
        // 클래스 멤버 호출시 이렇게하면 인스턴스를 만들지 않아도 된다.
        System.out.println(Calculator.PI);

    }
}
