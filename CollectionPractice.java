import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        // collection does not support idexOf
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(34);
        nums.add(5);
        nums.add(7);
        System.out.println(nums);
        System.out.println(" nums is of type " + ((Object) nums).getClass().getSimpleName());
        // List
        List<Integer> numsList = new ArrayList<Integer>();
        numsList.add(3);
        numsList.add(34);
        numsList.add(5);
        numsList.add(7);
        System.out.println(numsList.indexOf(34));
        // set it supports unique values (it does not have repeated values)
        Set<Integer> setNumber = new HashSet<Integer>();
        setNumber.add(8);
         setNumber.add(3);
        setNumber.add(3);
        setNumber.add(5);
        setNumber.add(7);
        System.out.println("SET" + setNumber);
    }
}
