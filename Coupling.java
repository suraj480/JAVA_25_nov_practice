interface Computer {
    void code();

}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, complile ,run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, complile ,run, Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Coupling {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        Developer suraj = new Developer();
        suraj.devApp(desk);

    }
}