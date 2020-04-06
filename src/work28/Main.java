package work28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        int x;
        for (int i = 0; i < 20; i++) {
            x = (int) (Math.random() * 10);
            arrayList.add(x);
        }
        System.out.println("Изначальный список: " + arrayList);
        x = (int)arrayList.get(1);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            if((int)iterator.next() > x ){
                x = (int)iterator.next();
            }
        }
        System.out.println("Найбольший элемент из списка: " + x);

    }
}
