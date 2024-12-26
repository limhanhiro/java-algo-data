package chapter6;

public class ShellSort {
    /**
     * 셸 정렬
     * 단순 삽입 정렬의 장점(이미 정렬이 되어있거나 정렬이 거의 되어 있는 경우 효율적)을 살린 정렬 알고리즘
     * 단점(삽입할 곳이 멀리 떨어져 있으면 이동하는 횟수가 많다)을 보완 한 알고리즘
     * 
     * 먼저 일정한 간격으로 서로 떨어져 있는 두 요소를 그룹으로 묶어 대략 정렬을 수행하고
     * 간경르 좁혀 그룹의 수를 줄이면서 정렬을 반복하여 요소의 이동 횟수를 줄이는 방법
     * 
     * 4-정렬
     * 등 4칸 떨어져 있는 요소를 그룹으로 묶어 정렬 (대략 정렬)
     * 
     * 대략 적으로 정렬한훈 단순 삽입 절렬을 수행한다
     */
    
     static void shellSort(int[] a) {
        int n = a.length;
        int h;

        //h의 초깃값을 결정
        //h의 값이 1이 될 때까지 h/3+1을 반복 (수열)
        for(h=1; h< n/3; h=h*3+1) {
            ;
        }
        System.out.println("초기 갭 h = " + h); 


        // 1 4 13 40 121 364 1093 ...
        while (h > 0) {
            System.out.println("현재 갭 h = " + h); // 현재 갭 값 출력
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
            // 현재 배열 상태 출력
            System.out.print("배열 상태: ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
            h /= 3; // 갭 줄이기
        }


    }
    public static void main(String[] args) {
        int[] a = {6,4,1,7,3,9,8};
        shellSort(a);
        for(int i=0; i<a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}
