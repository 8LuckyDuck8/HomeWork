package WORK17;

public class Task17 {
    public static void main(String[] args) {
        int elements[][] = new int[5][5];
        int m = 5;
        int n = 5;
        int j = 0;
        for (int i = 0; i < elements.length; i++) {
            switch (i) {
                case 1:
                case 3: {
                    for (j = 0; j < elements.length; j++) {
                        elements[i][j] = 1;
                    }
                    elements[i][0] = 0;
                    elements[i][4] = 0;
                    break;
                }
                case 2: {
                    for (j = 0; j < elements.length; j++) {
                        elements[i][j] = 1;
                    }
                    elements[i][0] = 0;
                    elements[i][1] = 0;
                    elements[i][3] = 0;
                    elements[i][4] = 0;
                    break;
                }
                default:{
                    for (j = 0; j < elements.length; j++) {
                        elements[i][j] = 1;
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < elements.length; i++) {
            for (j = 0; j < elements.length; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}
