package work19;

import java.sql.SQLOutput;

public class Task19 {
    public static void main(String[] args) {
        String str = "   asgag  . ;sagasg : !asgas ? test    ? sagasgas asgf sgasgsgas ";
        str = str.replaceAll("\\p{P}", " ");
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (i == 0) {
                if (symbol != ' ') {

                    n++;
                }
            } else {
                if (symbol != ' ') {
                    if (str.charAt(i - 1) == ' ') {
                        n++;
                    }
                }
            }

        }


        System.out.println("В строке " + n + " слов");
    }
}


