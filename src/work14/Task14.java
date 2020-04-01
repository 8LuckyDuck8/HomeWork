package work14;

public class Task14 {
    public static void main(String[] args) {
        int marks[] = new int [20];
        for(int i = 0 ; i < 20 ;i++){
            marks[i] = (int)(Math.random()*10 + 1);
            System.out.print(marks[i] + " " );
        }
        System.out.println();
        int maxMark = marks[0];
        int k = 0;
        for(int i = 0 ; i < marks.length ; i++ ){
            if(maxMark < marks[i]) {
                maxMark = marks[i];
                k = i;
            }
        }
        System.out.println("Номер максимальной оценки : " + k);
    }
}
