package work22;

public class Task22 {
    private int sec;
    private int min;
    private int hours;

    private Task22(int sec1) {
        hours = sec1 / 3600;
        min = (sec1 - hours * 3600) / 60;
        sec = sec1 - hours * 3600 - min * 60;
    }

    private Task22(int hours2, int min2, int sec2) {
        hours = hours2;
        min = min2;
        sec = sec2;
    }

    public static void main(String[] args) {
        Task22 task22 = new Task22(3680);
        task22.show(task22);
        task22.getSec(task22);

    }

    private void getSec(Task22 task22) {
        int sec = task22.sec + task22.min * 60 + task22.hours * 3600;
        System.out.println("Полное кол-во секунд: " + sec);
    }
    private int compareTo(Task22 firstObj , Task22 secondObj){
        int sec1 = firstObj .sec + firstObj .min * 60 + firstObj.hours * 3600;
        int sec2 = secondObj .sec + secondObj .min * 60 + secondObj.hours * 3600;
        if(sec1 > sec2){
            return 1;
        }else {
            if(sec1 < sec2){
                return -1;
            }else return 0;
        }
    }
    private void show(Task22 obj){
        System.out.println("Кол-во часов: " + obj.hours + " Кол-во минут: " + obj.min + " Кол-во секунд: " + obj.sec);
    }

}
