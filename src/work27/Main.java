package work27;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        int x;
        for (int i = 0; i < 20; i++) {
            x = (int) (Math.random() * 10);
            arrayList.add(x);
        }
        System.out.println("Изначальный список: " + arrayList);
        Set<Integer> hs = new LinkedHashSet<>();
        hs.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hs);
        System.out.println(arrayList);
    }
}
