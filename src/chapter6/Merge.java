package chapter6;

/**
 * 배열을 앞부분과 뒷부분 둘로 나누어 각각 정렬한다음 병합하는 작업을 반복
 */
public class Merge extends Swap{

    static void merge(int[] a, int[] b, int[] c) {
        int na = a.length;
        int nb = b.length;
        int pa = 0;
        int pb = 0;
        int pc = 0;
        

        while(pa < na && pb < nb) {
            //a[pa]와 b[pb]중 작은 값을 선택하여 c[pc]에 대입
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        }

        //a에 남은 요소를 복사
        while (pa < na) {
            c[pc++] = a[pa++];
        }
        //b에 남은 요소를 복사
        while (pb < nb) {
            c[pc++] = b[pb++];
        }
    }
    
    public static void main(String[] args) {
        int[] a = {2,4,6,8,11,13};
        int[] b = {1,2,3,4,9,16,21};
        int[] c = new int[a.length + b.length];
        
        System.out.println("두 배열의 병합");
        
        merge(a, b, c);
        
        System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
        System.out.println("배열 a : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("배열 b : ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
        System.out.println("배열 c : ");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
    }
}
