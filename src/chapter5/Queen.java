package chapter5;

public class Queen {
    /**
     * 규칙 1 각 열에 퀸을 1개만 배치한다
     * 규칙 2 각 행에 퀸을 1개만 배치한다
     * 대각선 고려한지 않는다
     */
    
    static boolean[] flag = new boolean[8]; //각 행에 퀸을 배치했는지 체크
    static int[] pos = new int[8]; //각 열의 퀸의 위치

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if(flag[j] == false) {
                pos[i] = j;
                if (i == 7) {
                    print();
                } else {
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        set(0);
    }
}
