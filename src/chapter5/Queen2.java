package chapter5;

public class Queen2 {
    /**
     * 규칙 1 각 열에 퀸을 1개만 배치한다
     * 규칙 2 각 행에 퀸을 1개만 배치한다
     * 대각선을 고려한다
     */
    
    static boolean[] flagA = new boolean[8]; //각 행에 퀸을 배치했는지 체크
    static boolean[] flagB = new boolean[15]; //     / 대각 행에 퀸을 배치했는지 체크
    static boolean[] flagC = new boolean[15]; //     \ 대각 해에 퀸을 배치했는지 체크
    static int[] pos = new int[8]; //각 열의 퀸의 위치

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            /**
             * / 대각선은 행+열의 값이 같다 0 ~ 14
             * \ 대각선은 행-열의 값이 같다 -7 ~ 7 의 범위를 + 7 을 해서 0 ~ 14로 만든다
             */
            if(flagA[j] == false && flagB[i + j] == false && flagC[i - j + 7] == false) {
                pos[i] = j;
                if (i == 7) {
                    print();
                } else {
                    flagA[j] = flagB[i+1] = flagC[i-j+7] = true;
                    set(i + 1);
                    flagA[j] = flagB[i+1] = flagC[i-j+7] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        set(0);
    }
}
