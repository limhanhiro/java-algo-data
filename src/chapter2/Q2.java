package chapter2;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11};
        int[] b = new int[a.length];

        reverseCopy(a,b);
        System.out.println(Arrays.toString(b));

    }



    public static void reverseCopy(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            b[i] = a[a.length-i-1];
        }
    }
    public static int sumOf(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;

    }

    public static void copy(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            b[i] = a[i];
        }
    }
    public  static void swqp(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        System.out.println("a["+idx1+"]과 a["+idx2+"]를 교환합니다.");
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void reverse(int[] a) {
        for(int i=0; i<a.length /2; i++) {
            swqp(a, i, a.length-i-1);
            System.out.println(Arrays.toString(a));
        }
    }
}
