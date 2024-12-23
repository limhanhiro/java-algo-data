package chapter6;

public class BubbleSort {
    /**
     * 이웃한 두 요소의 대소관계를 비교하고 필요에 따라 교환하는 정렬 알고리즘
     * 단순 교환 정렬
     */
    static void swap(int[] a, int idx1, int idx2) {
        // a[idx1]과 a[idx2]의 값을 바꿈
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void bubbleSort(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            // 패스의 회수
            for (int j = a.length - 1; j > i; j--) {

                count++;
                System.out.println(count + "회차" + a[j - 1] + "와 " + a[j] + "를 비교.");
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
                for (int k = 0; k < a.length; k++) {
                    System.out.print("a[" + k + "] : " + a[k]+ "  ");
                }
                System.out.println();
            }
        }
        System.out.println("count : " + count);
    }

    static void bubbleSort2(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            // 직전 패스에서 교환이 없다 면 정렬이 완료된 것이므로 종료
            int exchange = 0;
            for (int j = a.length - 1; j > i; j--) {
                count++;
                System.out.println(count + "회차" + a[j - 1] + "와 " + a[j] + "를 비교.");
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchange++;
                }
                for (int k = 0; k < a.length; k++) {
                    System.out.print("a[" + k + "] : " + a[k]+ "  ");
                }
                System.out.println();
                if(exchange == 0) {
                    break;
                }

            }
        }
        System.out.println("count : " + count);
    }


    static void bubbleSort3(int[] a) {
        int count = 0; 
        int last = 0; // 마지막 교환 위치를 저장하는 변수
    
        while (last < a.length - 1) {
            int newLast = a.length - 1; // 마지막으로 교환이 일어난 위치
    
            //마지막으로 교환이 일어난 위치 보다 큰경우 에만 교환을 한다
            for (int j = a.length -1; j > last; j--) {
                count++;
                System.out.println(count + "회차" + a[j - 1] + "와 " + a[j] + "를 비교.");
    
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j); // 교환
                    newLast = j; // 마지막으로 교환이 일어난 위치
                }
    
                // 배열 상태 출력
                for (int k = 0; k < a.length; k++) {
                    System.out.print("a[" + k + "] : " + a[k] + "  ");
                }
                System.out.println();
            }
    
            last = newLast; // 다음 반복에서의 끝 위치
        }
    
        System.out.println("count: " + count);
    }
    

    public static void main(String[] args) {
        int[] a = {1,3,6,4,7,8,9};
        int[] b = {1,3,6,4,7,8,9};
        int[] c = {1,3,9,4,7,8,6};

        System.out.println("bobbleSort");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

        bubbleSort(a);


        System.out.println("bobbleSort1 Sort is done.");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

        System.out.println("bobbleSort2");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] : " + b[i]);
        }
        bubbleSort2(b);
        System.out.println("bobbleSort2 Sort is done.");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] : " + b[i]);
        }

        System.out.println("bobbleSort3");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] : " + c[i]);
        }
        bubbleSort3(c);
        System.out.println("bobbleSort3 Sort is done.");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] : " + c[i]);
        }

    }
}
