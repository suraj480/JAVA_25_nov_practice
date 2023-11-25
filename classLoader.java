class Mobile {
    String brand;
    int price;
    static String name;
    static {
        name = "Phone";
        System.out.println("IN static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        name = "Phone";
        System.out.println("IN Constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class classLoader {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Mobile");
    //     Mobile obj1 = new Mobile();
    //     obj1.brand = "Apple";
    //     obj1.price = 1500;
    //     Mobile.name = "Samsung";
    //    Mobile obj2 = new Mobile();

    }
}
