class A {
    public A() {
        System.out.println("In A");
    }

    public A(int m) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        System.out.println("In B");
    }

    public B(int n) {
        super(n);
        System.out.println("In B int");
    }
}

public class superPractice {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
