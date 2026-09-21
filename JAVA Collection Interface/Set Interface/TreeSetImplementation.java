package Set Interface;

import java.util.*;

public class TreeSetImplementation {

    public static void main(String[] args) {

        // TreeSet:
        // 1. Stores UNIQUE elements
        // 2. Automatically keeps elements SORTED
        // 3. Does not use index
        // 4. Basic operations are generally O(log n)

        TreeSet<Integer> set = new TreeSet<>();


        // =========================
        // 1. add()
        // =========================

        set.add(40);
        set.add(20);
        set.add(60);
        set.add(10);
        set.add(30);

        // Duplicate is ignored
        set.add(40);

        System.out.println(set);
        // [10, 20, 30, 40, 60]


        // =========================
        // 2. remove()
        // =========================

        set.remove(30);

        System.out.println(set);
        // [10, 20, 40, 60]


        // =========================
        // 3. contains()
        // =========================

        System.out.println(set.contains(40));
        // true

        System.out.println(set.contains(30));
        // false


        // =========================
        // 4. size()
        // =========================

        System.out.println(set.size());


        // =========================
        // 5. isEmpty()
        // =========================

        System.out.println(set.isEmpty());


        // =========================
        // 6. first()
        // =========================

        // Smallest element
        System.out.println(set.first());
        // 10


        // =========================
        // 7. last()
        // =========================

        // Largest element
        System.out.println(set.last());
        // 60


        // =========================
        // 8. higher()
        // =========================

        // Smallest element GREATER than 40
        System.out.println(set.higher(40));
        // 60


        // =========================
        // 9. lower()
        // =========================

        // Largest element SMALLER than 40
        System.out.println(set.lower(40));
        // 20


        // =========================
        // 10. ceiling()
        // =========================

        // Smallest element >= 40
        System.out.println(set.ceiling(40));
        // 40


        // =========================
        // 11. floor()
        // =========================

        // Largest element <= 40
        System.out.println(set.floor(40));
        // 40


        // =========================
        // 12. headSet()
        // =========================

        // Elements BEFORE 40
        System.out.println(set.headSet(40));
        // [10, 20]


        // =========================
        // 13. tailSet()
        // =========================

        // Elements FROM 40 onwards
        System.out.println(set.tailSet(40));
        // [40, 60]


        // =========================
        // 14. iterator()
        // =========================

        // Traverses in sorted order
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // =========================
        // 15. clear()
        // =========================

        set.clear();

        System.out.println(set);
        // []
    }
}
