package work20;

public class Task20 {
    public static void main(String[] args) {
        String str = "  Тестовая   строка   разными  знаками   препинания ";
        String str1 = "";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol != ' ') {
                if (str.charAt(i + 1) == ' ') {
                   str1 += symbol;
                }
            }
        }
        System.out.println(str);
        System.out.println("Строка составленная из последних букв исходной строки: " + str1);
    }

}
