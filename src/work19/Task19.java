package work19;

import java.sql.SQLOutput;

public class Task19 {
    public static void main(String[] args) {
        String str = "  . ; : ! ? test    ?  ";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            boolean b = symbol != ',' && symbol != '?' && symbol != '.' && symbol != ':' && symbol != ';' && symbol != '-' && symbol != '!';
            if(i == 0 ){
                if (symbol != ' ') {
                    if(b) {
                        n++;
                    }else continue;
                }
            }else{
                if (symbol != ' ') {
                    if (b) {
                        if (str.charAt(i - 1) == ' ') {
                            n++;
                        }
                    }
                }

            }

        }
        System.out.println("В строке " + n + " слов");
        System.out.println(str.charAt(0));
    }
}
