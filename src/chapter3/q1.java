package chapter3;


public class Q1 {
    
    public static void main(String[] args) {
        int[] a = {3,3,3,3,1,2,4,4,4,4};
        int result = seqSearchScanFor(a, a.length, 2);
        System.out.println("그 값은" + result + "번째에 있습니다.");
        
    }



    /**
     * 선형 검색의 시간 복잡도
     * 
     * @param args
     */
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if(i == n) {
                return -1;
            }
            if(a[i] == key) {
                return i;
            }
            i++;
        }
    }

    static int seqSearchSenFor(int[] a, int n, int key) {
        a[n] = key;
        for(int i=0; i<n; i++) {
            if(a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int seqSearchScan(int[] a, int n, int key) {
        // 스캐닝 과정 출력
        int count = 0;
        boolean isFind = true;
        int result = -1;
        System.out.print("   |");
        for(int i=0; i<n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("---+");
        for(int i=0; i<n*2; i++) {
            System.out.print("-");
        }
        System.out.println();
        while (isFind) {
            System.out.print("   |");
            for(int i=0; i<=count; i++) {
                if(i == count) {
                    System.out.print("*  ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.print(count+ "  |");
            for(int i=0; i<n; i++) {
                System.out.print(+a[i] +" ");
            }
            if(a[count] == key) {
                isFind = false;
                result = count;
                System.out.println();
                return result;
            }
            System.out.println();
            count++;
        }
        return result;
        
        

    }

    static int seqSearchScanFor(int[] a, int n, int key) {
        // 스캐닝 과정 출력
        System.out.print("   |");
        for(int i=0; i<n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("---+");
        for(int i=0; i<n*2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for(int count = 0; count<n; count++) {
            System.out.print("   |");
            for(int i=0; i<count; i++) {
                System.out.print("  ");
            }
            System.out.println("*");
            System.out.print(count+ "  |");
            for(int i=0; i<n; i++) {
                System.out.print(+a[i] +" ");
            }
            System.out.println();
            if(a[count] == key) {
                return count;
            }
        }
        return -1;
    }
}
