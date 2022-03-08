// 자바에서 만드는 모든 클래스는 Object 클래스를 상속받는다.
class Animal extends Object{
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

// 메소드 overriding
class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
}

public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

        HouseDog houseDog = new HouseDog();
        houseDog.setName("poppy");
        System.out.println(houseDog.name);
        houseDog.sleep();
    }
}
