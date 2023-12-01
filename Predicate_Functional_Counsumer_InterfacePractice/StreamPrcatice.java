package Predicate_Functional_Counsumer_InterfacePractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamPrcatice {
    public static void main(String[] args) {

        List<String> student = new ArrayList<String>();
        student.add("suraj");
        student.add("max");
        student.add("pax");
        student.add("sam");
        List<String> fileteredList = student.stream().filter((name) -> {
            return name.startsWith("s");
        }).collect(Collectors.toList());
        
System.out.println(fileteredList);
    }
    
}
