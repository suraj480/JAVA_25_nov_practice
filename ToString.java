class Student {
    int rollno;
    String name;

    Student(int sRollNo, String sName) {
        this.rollno = sRollNo;
        this.name = sName;
    }

    public String toString() {
        return rollno + " : " + name;
    }
}

public class ToString {
    public static void main(String[] args) {
        Student s1 = new Student(16, "suraj");
        System.out.println(s1);
    }
}