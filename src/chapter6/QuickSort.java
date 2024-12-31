package chapter6;

import java.sql.SQLWarning;

import chapter4.IntStack;

/**
 * 퀵 정렬
 * 매우 빠른 정렬 알고리즘
 * 피벗(pivot)을 기준으로 큰 요소와 작은 요소를 그룹으로 나눈다
 * 각 그룹에서 다시 피벗을 정하고 그룹을 나누어 정렬하는 방식
 * 
 * 
 * 피벗 이 n 인경우
 * array[0] ~ array[pl -1] : a[n] 이하의 요소
 * array[pr +1] ~ array[n-1] : a[n] 보다 큰 요소
 */

public class QuickSort extends Swap{


        /**
         * 피 벗 기준으로 그룹 화 하는 메서드
         */
        static void partition(int[] a, int n) {

            int pl = 0; // 왼쪽 커서
            int pr = n - 1; // 오른쪽 커서
            int pivot = a[n / 2]; // 피벗(가운데)
            
            do {
                while (a[pl] < pivot) pl++; // 왼쪽 커서가 피벗보다 작으면 계속 오른쪽으로 이동
                while (a[pr] > pivot) pr--; // 오른쪽 커서가 피벗보다 크면 계속 왼쪽으로 이동
                //왼쪽 커서가 오른쪽 커서를 넘어가지 않으면
                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr); // 왼쪽 커서가 오른쪽 커서를 넘어가면 종료

            System.out.println("피벗의 값은 " + pivot + "입니다.");

            System.out.println("피벗 이하의 그룹");
            for (int i = 0; i <= pl - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("피벗 이상의 그룹");
            for (int i = pr + 1; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }

        /**
         * 재귀 호출을 이용한 퀵 정렬
         */
        static void quickSort(int[] a, int left, int right){
            int pl = left; // 왼쪽 커서
            int pr = right; // 오른쪽 커서
            int x = a[(pl + pr) / 2]; // 피벗(가운데 요소)

            do {
                while (a[pl] < x) pl++; // 왼쪽 커서가 피벗보다 작으면 오른쪽으로 이동
                while (a[pr] > x) pr--; // 오른쪽 커서가 피벗보다 크면 왼쪽으로 이동
                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if (left < pr) {
                quickSort(a, left, pr);
            }
            if (pl < right) {
                quickSort(a, pl, right);
            }
        }


        /**
         * 비재귀적인 퀵 정렬
         */
        static void quickSort2(int[] a, int left, int right) {
            //데이터를 일시적으로 저장 하기 위한 스택을 생성한다
            IntStack lstack = new IntStack(right - left + 1);
            IntStack rstack = new IntStack(right - left + 1);

            lstack.push(left);
            rstack.push(right);

            while (lstack.isEmpty() != true) {
                int pl = left = lstack.pop();
                int pr = right = rstack.pop();
                int x = a[(left + right) / 2];

                do {
                    while (a[pl] < x) pl++;
                    while (a[pr] > x) pr--;
                    if (pl <= pr) {
                        swap(a, pl++, pr--);
                    }
                } while (pl <= pr);

                if (left < pr) {
                    lstack.push(left);
                    rstack.push(pr);
                }
                if (pl < right) {
                    lstack.push(pl);
                    rstack.push(right);
                }
            }
        }

        /**
         *  피벗을 선정
         *  pl pr 중앙 값을 받아서 세 값중 중앙값을 피벗(배열의 가운대로 위차하도록)으로 선정
         */
        static int selectPivot(int[] x, int a, int b , int c) {
            if (x[b] < x[a]) {
                swap(x, b, a);
            }
            if (x[c] < x[b]) {
                swap(x, c, b);
            }
            if (x[b] < x[a]) {
                swap(x, b, a);
            }
            return b;
            
        }

        /**
         * 피벗을 선정 하여 퀵 정렬
         */
        static void quickSort3(int[] a, int left, int right){
            int pl = left; // 왼쪽 커서
            int pr = right; // 오른쪽 커서
            int middle = selectPivot(a, right, (right+left) /2, left);
            int x = a[middle]; // 피벗(가운데 요소)
            

            do {
                while (a[pl] < x) pl++; // 왼쪽 커서가 피벗보다 작으면 오른쪽으로 이동
                while (a[pr] > x) pr--; // 오른쪽 커서가 피벗보다 크면 왼쪽으로 이동
                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if (left < pr) {
                quickSort3(a, left, pr);
            }
            if (pl < right) {
                quickSort3(a, pl, right);
            }
        }

        public static void main(String[] args) {
            int[] a = {1,8,7,4,5,2,6,3,9};
            quickSort3(a, 0, a.length - 1);
            System.out.println("오름차순 정렬 완료");
            for (int i = 0; i < a.length; i++) {
                System.out.println("a[" + i + "] = " + a[i]);
            }
        }

    


    
}
