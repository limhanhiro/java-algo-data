package chapter3;

public class q5 {
    public static void main(String[] args) {
        int[] a = {1,3,2,3,7,7,7,8,8,9,11};
        int result = binSearchX(a, a.length, 7);
        System.out.println(a[result]);

    }


    
    

    static int binSearchX(int[] a, int n, int key) {
     
        //검색할 키값과 같은 값을 갖는 요소가 하나이 상인 경우, 가장 앞쪽의 요소의 인덱스를 반환
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n-1; // 검색 범위의 끝 인덱스
        int pc = (pl + pr) / 2; // 중앙 요소 인덱스
        while(pl <= pr) {
            if(a[pc] == key) {
                //앞쪽에 같은 값이 있는지 확인
                while( pc > 0 && a[pc-1] == key) {
                    System.out.println("앞에 같은 값이 있습니다.");
                    pc--;
                }
                return pc+1;
            }else if(a[pc] < key) {
                pl = pc + 1;
            }else {
                pr = pc - 1;
            }
            pc = (pl + pr) / 2;
        }
        return -1;
    }
}
