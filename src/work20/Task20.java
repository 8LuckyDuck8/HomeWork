package work20;

public class Task20 {
    public static void main(String[] args) {
        String str = " test! test ? test.., ygd";
        System.out.println(str);
        str = str.replaceAll("\\p{P}", " ");
        String str1 = "";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol != ' ') {
                if (i + 1 == str.length()) {
                    str1 += symbol;
                } else {
                    if(str.charAt(i+1)==' ') {
                        str1 += symbol;
                    }
                }
            }

        }
        System.out.println("Строка составленная из последних букв исходной строки: " + str1);
    }

}
