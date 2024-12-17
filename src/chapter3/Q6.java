package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i-1]);

        }
        System.out.println("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0) {
            //음수인 이유는 찾는 값이 없을 때, 삽입 포인트를 반환하기 때문이며
            // -1 을 빼주는 이유는 0 과 -0을 구분하기 위함이다
            System.out.println(idx);
            int insPoint = -idx - 1;
            System.out.println(ky+"은(는) x["+insPoint+"]에 삽입해야 합니다.");
        } else {
            System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
        }

    }

}