package chapter3;

public class q4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int result = binSearchScan(a, a.length, 3);
        System.out.println("그 값은" + (result+1) + "번째에 있습니다.");
        
    }

    static int binSearchScan(int[] a, int n, int key) {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n-1; // 검색 범위의 끝 인덱스
        int pc = (pl + pr) / 2; // 중앙 요소 인덱스
        System.out.print("   |");
        for(int i=0; i<n; i++) {
            System.out.print("  "+i);
        }
        System.out.println();
        System.out.print("---+");
        for(int i=0; i<n*3; i++) {
            System.out.print("-");
        }
        System.out.println();
        while(pl <= pr) {
            System.out.print("   |");
            for(int i=0; i<n; i++) {
                if(i == pl) {
                    System.out.print("<- ");
                }else if(i == pr) {
                    System.out.print(" ->");
                }else if(i == pc) {
                    System.out.print("  *");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            System.out.print(a[pc]+ "  |");
            for(int i=0; i<n; i++) {
                System.out.print("  " +a[i]);
            }
            System.out.println();
            if(a[pc] == key) {
                return pc;
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
