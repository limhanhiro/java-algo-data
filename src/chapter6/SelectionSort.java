package chapter6;

public class SelectionSort {


    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            //정렬되지 않은 부분에서 가작 작은 요소의 인덱스
            int min = i; 
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) {
        int[] a = {3,3,3,3,1,2,4,4,4,4};
        selectionSort(a);
        for(int i=0; i<a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
    
}
