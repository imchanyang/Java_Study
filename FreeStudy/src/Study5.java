interface t {
    public void add1(int a, int b);
}
class a implements t{
    int a;
    int b;

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b);
    }

    public void add1(int a, int b) {
        System.out.println("complete");
    }


}


public class Study5 {
    public static void main(String[] args) {
        a a_ = new a();


        System.out.println(b_.print());

    }
}
