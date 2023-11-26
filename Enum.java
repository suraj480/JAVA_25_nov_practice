enum Status {
    Running, Failed, Success, Pending;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Failed;
        switch (s) {
            case Running:
                System.out.print("All good");
                break;
            case Failed:
                System.out.print("Try Again");
                break;
            case Pending:
                System.out.print("please wait");
                break;
            default:
                System.out.print("Done");
                break;
        }
        System.out.print(s);
    }
}
