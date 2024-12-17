package chpater2;

import java.util.Random;
import java.util.Scanner;

public class Pra {
    public static void main(String[] args) {
        int[] a = {3,3,3,3,1,2,4,4,4,4};
        for(int i=0; i<a.length /2; i++) {
            swqp(a, i, a.length-i-1);
        }
        for(int i=0; i<a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }

    public static void swqp(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}
