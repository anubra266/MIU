package classcode.FPP.Lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableForEach {
    public static void main(String[] args) {
        List<String> javaList = new ArrayList<>();
        javaList.add("Bob");
        javaList.add("Carol");
        javaList.add("Steve");

        javaList.forEach(name -> System.out.println(name));
        System.out.println("\n");

        Iterator<String> it = javaList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
