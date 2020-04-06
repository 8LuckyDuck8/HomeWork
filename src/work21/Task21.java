package work21;


public class Task21 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder strBuilder = new StringBuilder();
        long lBegin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        long lEnd = System.currentTimeMillis();
        long lDelta = lEnd - lBegin;
        System.out.println(str);
        System.out.println("Время выполнения с помощью класса String: " + lDelta);
        long lBegin1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strBuilder.append(i);
        }
        long lEnd1 = System.currentTimeMillis();
        long lDelta1 = lEnd - lBegin;
        System.out.println(strBuilder);
        System.out.println("Время выполнения с помощью класса StringBuilder: " + lDelta);
    }

    long lBegin = System.currentTimeMillis();

    long lEnd = System.currentTimeMillis();
    long lDelta = lEnd - lBegin;
}
