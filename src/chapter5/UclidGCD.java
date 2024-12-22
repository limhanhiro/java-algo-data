package chapter5;

public class UclidGCD {

class GCD {
    //정수 x, y의 최대공약수를 재귀적으로 호출
    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    //재귀 호출 없이 최대 공약수를 구하는 방법
    static int gcd2(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
            System.out.println("x : " + x + " y : " + y);
        }
        return x;
    }

    //배열 x 의 모든 요소의 최대 공약수를 구하는 메서드
    static int gcdArray(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = gcd(result, a[i]);
            System.out.println(result);
            if (result == 1) { 
                break;
            }
        }
        return result;
    }

}

    public static void main(String[] args) {
        int[] x = {16, 8, 12, 6};
        System.out.println(GCD.gcdArray(x));

    }    
}
