package chapter3;



public class Q3 {
    public static void main(String[] args) {
        int[] a = {1,9,2,9,4,6,7,9};
        int[] idx = new int[a.length];
        int result = searchIdx(a, a.length, 9, idx);
        System.out.println("그 값은" + result + "개 있습니다.");
        
        
    }
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;
        for(int i=0; i<n; i++) {
            if(a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }

}
