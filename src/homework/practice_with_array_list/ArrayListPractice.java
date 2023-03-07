package homework.practice_with_array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

    public static void sortOfArrayList(String ... strings) {
        ArrayList<String> arrayListForSort = new ArrayList<>();
//        arrayListForSort.add("B");
//        arrayListForSort.add("G");
//        arrayListForSort.add("A");
//        arrayListForSort.add("C");
//        Collections.sort(arrayListForSort);
//        System.out.println(arrayListForSort);

        for (String s:
             strings) {
            if (!arrayListForSort.contains(s)){
                arrayListForSort.add(s);
            }
            Collections.sort(arrayListForSort);
        }
        System.out.print(" " + arrayListForSort);
    }
}
