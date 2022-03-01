package imchanyang.calendar;

import java.util.Scanner;

public class Calendar {
    private static final int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

    public int getMaxDaysOfMonth(int month) {
        return maxDays[month-1];
    }

    public void printSampleCalendar() {
        // println을 활용해서 달력 출력
        System.out.println(" 일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] args) {

        // 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        // 반복 실행을 위해 for문 사용
        Calendar cal = new Calendar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("반복 횟수를 입력하세요 : ");
        int repeat = scanner.nextInt();

        for(int i = 0; i < repeat; i++) {
            System.out.println("달을 입력하세요 : ");
            int month = scanner.nextInt();

            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));

            System.out.println("------------------if 조건문을 이용해서 출력---------------");

            // if를 이용해서 출력
            if(month == 2) {
                System.out.printf("%d월은 29일까지 있습니다.\n", month);
            }
            else if(month % 2 == 0) {
                System.out.printf("%d월은 30일까지 있습니다.\n", month);
            }
            else {
                System.out.printf("%d월은 31일까지 있습니다.\n", month);
            }

            System.out.println("------------------switch 조건문을 이용해서 출력---------------");

            switch (month) {
                case 2:
                    System.out.printf("%d월은 29일까지 있습니다.\n", month);
                    break;
                case 4:
                case 6:
                case 8:
                case 10:
                case 12:
                    System.out.printf("%d월은 30일까지 있습니다.\n", month);
                    break;
                default:
                    System.out.printf("%d월은 31일까지 있습니다.\n", month);
                    break;

            }
        }


        System.out.println("------------------예시 달력---------------");
        cal.printSampleCalendar();
        scanner.close();

    }
}
