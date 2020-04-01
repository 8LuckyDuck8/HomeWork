package work19;

public class Task19 {
    public static void main(String[] args) {
        String str = "  Тестовая   строка   разными  знаками   препинания  saga  asgasg  asgsag     asgasg  ";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if(i < 1){
                if (symbol != ' ') {
                    n++;
                }
            }else{
                if (symbol != ' ') {
                    if(str.charAt(i-1) != ' ') {
                        continue;
                    }else {
                        n++;
                    }
                }

            }

        }
        System.out.println("В строке " + n + " слов");
    }
}
