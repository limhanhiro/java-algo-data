package chapter4;

// 배열로 인큐 디큐 구현
public class IntQueue {

    private int[] que; // 큐 본체
    private int capacity; // 큐 용량
    private int num; // 현재 데이터 개수

    //생성자
    public IntQueue(int maxLen) {
        this.que = new int[capacity];
        this.capacity = maxLen;
        this.num = 0;
    }


    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }
    
    // 인큐
    public int enqueue(int x) {
        if (num >= capacity) {
            throw new OverflowIntQueueException();
        }
        return que[num++] = x;
    }

    //디큐
    public int dequeue() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[0];
        //아래로 한칸씩 이동
        for (int i = 0; i < num - 1; i++) {
            que[i] = que[i + 1];
        }
        num--;
        return x;
    }
    

}



    

