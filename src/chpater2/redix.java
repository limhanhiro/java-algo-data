package chpater2;

import java.util.Scanner;

public class Redix {
    private static final String REF = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i=0; i<dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한번 더 할까요? (1.예/0.아니오): ");
            retry = sc.nextInt();
        } while (retry == 1);

    }

    public static int cardConv(int a, int b ,char[] d) {
        int digits = 0;
        do {
            d[digits++] = REF.charAt(a % b);
            a /= b;
        } while (a != 0);
        for (int i=0; i<digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = t;
        }

        return digits;
    }

}
