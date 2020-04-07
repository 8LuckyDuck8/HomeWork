package work18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        String str = "test! test? test.*%# ? ";
        Matcher m = Pattern.compile("\\p{Punct}").matcher(str);
        int n = 0;
        while(m.find()) n++;
        System.out.println("В строке " + n + " знаков препинаяния");
    }
}
