package chapter1;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        // 입력한 수를 한변으로 하는 정사갹형을 * 로 출력하는 프로그램
        //scanner 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("정사각형의 크기를 입력하세요: ");
        int n = sc.nextInt();
        System.out.println("변의 길이 : "+  n);
        for(int i=0; i<n; i++) {
            System.out.println("*".repeat(n));
        }
    }
}
