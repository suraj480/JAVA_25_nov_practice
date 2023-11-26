import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SortingPractice {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();
        number.add(4);
        number.add(1);
        number.add(3);
        number.add(8);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

        // sort based on last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> numberNew = new ArrayList<Integer>();
        numberNew.add(64);
        numberNew.add(11);
        numberNew.add(33);
        numberNew.add(58);
        numberNew.add(22);
        numberNew.add(19);
        Collections.sort(numberNew, com);
        System.out.println("numberNew" + numberNew);

    }
}
