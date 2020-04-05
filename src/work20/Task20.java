package work20;

public class Task20 {
    public static void main(String[] args) {
        String str = " test! test ? test.., ";
        String str1 = "";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            boolean b = symbol != ',' && symbol != '?' && symbol != '.' && symbol != ':' && symbol != ';' && symbol != '-' && symbol != '!';
            if (symbol != ' ') {
                if(b) {
                    if (i + 1 == str.length()) {
                        str1 += symbol;
                    } else {
                        boolean b2 = str.charAt(i + 1) == ' ' || str.charAt(i + 1) == ',' || str.charAt(i + 1) =='?' || str.charAt(i + 1) =='.'
                                || str.charAt(i + 1) ==':' || str.charAt(i + 1) ==';' || str.charAt(i + 1) =='-' || str.charAt(i + 1) == '!';
                        if (b2) {
                            str1 += symbol;
                        }
                    }
                }
            }
        }
        System.out.println(str);
        System.out.println("Строка составленная из последних букв исходной строки: " + str1);
    }

}
