package work31;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = null;
        int sum= 0;
        List arrayList = new ArrayList();
        Pattern p = Pattern.compile("-?\\d+");
        try {
            bufferReader = new BufferedReader(new FileReader("E:\\WORK\\project1\\resources\\InputFile1"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        String res = bufferReader.readLine();
        while (res != null) {
            System.out.println(res);
            if (res != null) {
                Matcher m = p.matcher(res);
               while (m.find()){
                    int k = Integer.parseInt(m.group());
                    arrayList.add(k);

               }
            }
            res = bufferReader.readLine();
        }
        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            sum += (int)iterator.next();
        }
        System.out.println("Сумма цифр = " + sum);
        Set<Integer> hs = new LinkedHashSet<>();
        hs.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hs);
        System.out.println(arrayList);
    }
}


