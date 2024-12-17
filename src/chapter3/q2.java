package chapter3;



public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int result = binSearch(a, a.length, 3);
        System.out.println("그 값은" + result + "번째에 있습니다.");
        
    }

    static int binSearch(int[] a, int n, int key) {
        int count = 1;
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n-1; // 검색 범위의 끝 인덱스
        int pc = (pl + pr) / 2; // 중앙 요소 인덱스
        while(pl <= pr) {
            if(a[pc] == key) {
                System.out.println("비교횟수 : " + count);
                return pc;
            }else if(a[pc] < key) {
                pl = pc + 1;
            }else {
                pr = pc - 1;
            }
            pc = (pl + pr) / 2;
            count++;
        }
        return -1;
    }


}
