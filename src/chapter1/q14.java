package chapter1;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        spira(5);
    }


    public static void spira(int n){
//        for(int i=1; i<=n; i++) {
//            for(int j=0; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=0; j<2*(i-1)+1; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

    }
    public static void triangleLB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleLU(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleRU(int n) {

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(n-1-i >=i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void triangleRB(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                if(n-i-1<=j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
