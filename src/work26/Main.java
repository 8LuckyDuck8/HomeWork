package work26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        int x;
        for (int i = 0; i < 20; i++) {
            x = (int)(Math.random() * 10);
            arrayList.add(x);
        }
        System.out.println("Изначальный список оценок: " + arrayList);
        for(int i = 19; i >= 0 ; i--){
            if((int)arrayList.get(i) < 4){
                arrayList.remove(i);
            }
        }
        System.out.println("Список удовлетворительных оценок: " + arrayList);
    }

}
