package chapter5;

public class Factorial {


    /**
     * 직접 재귀 방식
     * (자신과 동알한 메스드를 호출 하는 방식)
     */
    static int factorial(int n) {
        // if (n > 0) {
        //     //재귀 호출
        //     return n * factorial(n - 1);
        // } else {
        //     return 1;
        // }

        return (n > 0) ? n * factorial(n - 1) : 1;
    }
    // 재귀호출 없이 팩토리얼 구현
    static int factorial2(int n) {
        int result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(2));
    }
    
}
