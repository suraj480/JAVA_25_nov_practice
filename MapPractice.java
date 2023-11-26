import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("suraj", 21);
        students.put("drishti", 24);
        // System.out.println(students);
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
