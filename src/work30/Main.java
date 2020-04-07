package work30;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = null;
        int n1 = 0;
        int n2 = 0;
        char symbol;
        try {
            bufferReader = new BufferedReader(new FileReader("E:\\WORK\\project1\\resources\\InputFile"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        String res = bufferReader.readLine();
        while(res != null){
            System.out.println(res);
            if (res != null) {
                Matcher m = Pattern.compile("\\p{Punct}").matcher(res);
                while(m.find()) n1++;
                res = res.replaceAll("\\p{Punct}", "");
                System.out.println(res);
                for (int i = 0; i < res.length(); i++) {
                    symbol = res.charAt(i);
                    if (i == 0) {
                        if (symbol != ' ') {
                            n2++;
                        }
                    } else {
                        if (symbol != ' ') {
                            if (res.charAt(i - 1) == ' ') {
                                n2++;
                            }
                        }
                    }

                }
            }
            res = bufferReader.readLine();
        }
        System.out.println("В строке " + n2 + " слов и " + n1 + " знаков препинаяния");
    }
}
