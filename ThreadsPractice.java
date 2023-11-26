class A extends Thread{
    public void show() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hi");
        }

    }
}
class B extends Thread{
    public void show() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello");
        }

    }
}
public class ThreadsPractice {
public static void main(String[] args) {
    A objA=new A();
    B objB =new B();
    objA.show();
    objB.show();
}
}
