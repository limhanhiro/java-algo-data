package chapter6;

public class InsertSort extends Swap{
    
    static void insertSort(int[] a) {
        for(int i=1; i<a.length; i++) {
            int j;
            int tmp = a[i];
            //배열의 앞쪽 요소를 하나씩 비교하여 더 작은 요소를 만날 때까지 교환
            for(j=i; j>0 && a[j-1] > tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {6,4,1,7,3,9,8};
        insertSort(a);
        for(int i=0; i<a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }


    
}
