package work6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = in.nextInt();

        System.out.println("Введите месяц: ");
        int month = in.nextInt();
        int day = 0;

        if (month == 1) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1" + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 2) {
            if ((2020 - year) % 4 == 0) {
                System.out.println("Введите день [1] - [29]: ");
                day = in.nextInt();
                while (true) {
                    if (day < 1 || day > 29) {
                        System.out.println("Ошибка ввода.Введите день [1] - [29]:");
                        day = in.nextInt();
                    } else break;
                }
                if (day == 29) {
                    System.out.println("1." + (month + 1) + "." + year);
                } else
                    System.out.println((day + 1) + "." + month + "." + year);

            } else {
                System.out.println("Введите день [1] - [28]: ");
                day = in.nextInt();
                while (true) {
                    if (day < 1 || day > 28) {
                        System.out.println("Ошибка ввода.Введите день [1] - [28]:");
                        day = in.nextInt();
                    } else break;
                }
                if (day == 28) {
                    System.out.println("1." + (month + 1) + "." + year);
                } else
                    System.out.println((day + 1) + "." + month + "." + year);
            }
        } else if (month == 3) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 4) {
            System.out.println("Введите день [1] - [30]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 30) {
                    System.out.println("Ошибка ввода.Введите день [1] - [30]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 30) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 5) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 6) {
            System.out.println("Введите день [1] - [30]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 30) {
                    System.out.println("Ошибка ввода.Введите день [1] - [30]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 30) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 7) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 8) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 9) {
            System.out.println("Введите день [1] - [30]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 30) {
                    System.out.println("Ошибка ввода.Введите день [1] - [30]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 30) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 10) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 11) {
            System.out.println("Введите день [1] - [30]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 30) {
                    System.out.println("Ошибка ввода.Введите день [1] - [30]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 30) {
                System.out.println("1." + (month + 1) + "." + year);
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        } else if (month == 12) {
            System.out.println("Введите день [1] - [31]: ");
            day = in.nextInt();
            while (true) {
                if (day < 1 || day > 31) {
                    System.out.println("Ошибка ввода.Введите день [1] - [31]:");
                    day = in.nextInt();
                } else break;
            }
            if (day == 31) {
                System.out.println("1.1." + (year + 1));
            } else
                System.out.println((day + 1) + "." + month + "." + year);

        }


    }

}
