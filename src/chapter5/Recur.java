package chapter5;

import chapter4.IntStack;

public class Recur {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    static void recur2(int n) {
        while (n >0) {
            recur2(n-1);
            System.out.println(n);
            n = n - 2;
        }
    }

    static void recur3(int n) {
        IntStack s = new IntStack(n);
        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
            
        }
    }


    public static void main(String[] args) {
        recur(4);
        /**
         * 실행 순서 
         * recur(4) : recur(3) 4 recur(2) print 4
         * -> recur(3) : reqcur(2) 3 reqcur(1)  print 3 print 1
         * -> recur(2) : recur(1) 2 recur(0) print 2
         * -> recur(1) : recur(0) 1 recur(-1) print 1
         * -> recur(0) : -
         * print 4
         * recur(2) : recur(1) 2 recur(0) print 2
         * -> recur(1) : recur(0) 1 recur(-1) print 1
         * -> recur(0) : -
         */ 
        System.out.println("--------------------------------");
        recur2(4);
        /**
         * 실행 순서 
         * recur2(4) : recur2(3) 4 recur2(2) print 4
         * -> recur2(3) : reqcur2(2) 3 reqcur2(1)  print 3 print 1
         * -> recur2(2) : recur2(1) 2 recur2(0) print 2
         * -> recur2(1) : recur2(0) 1 recur2(-1) print 1
         * -> recur2(0) : -
         * print 4
         * recur2(2) : recur2(1) 2 recur2(0) print 2
         * -> recur2(1) : recur2(0) 1 recur2(-1) print 1
         * -> recur2(0) : -
         */
        
    }
    
}
