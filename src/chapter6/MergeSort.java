package chapter6;

public class MergeSort {

    static int[] buff; // 작업용 배열

    static void merge(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            // 배열의 크기가 1이 되는 시점이 올때 까지 호출 한다
            merge(a, left, center); // 배열의 앞부분을 병합 정렬
            merge(a, center + 1, right); // 배열의 뒷부분을 병합 정렬

            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }

            while (i <= right && j < p) {
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }

            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

    static void mergeSort(int[] a, int n) {
        buff = new int[n]; // 작업용 배열을 생성

        merge(a, 0, n - 1); // 배열 전체를 병합 정렬

        buff = null; // 작업용 배열을 해제
    }

    public static void main(String[] args) {
        int[] a = {22, 5, 11, 32, 120, 68, 70};
        int n = a.length;

        System.out.println("병합 정렬을 수행합니다.");

        mergeSort(a, n); // 배열 a를 병합 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

    
}
