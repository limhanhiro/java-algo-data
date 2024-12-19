package chapter4;

//버퍼링을 이용한 큐
public class RingQueue {
    
    private int[] que; 
    private int capacity;
    /**
     * 현재 데이터 수
     * 비어있는지 가득 차 있는지 확인하는 용도
     */
    private int num;
    //front : 맨 앞 데이터 커서
    private int front;
    //rear : 맨 끝 데이터 커서
    private int rear;


    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    //생성자
    public RingQueue(int maxLen) {
        this.capacity = maxLen;
        this.que = new int[capacity];
        num = front = rear = 0;

        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //인큐
    public int enqueue(int x) {
        if (num >= capacity) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    //디큐
    public int dequeue() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    //피크
    public int peek() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    //clear
    public void clear() {
        num = front = rear = 0;
    }

    //검색
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            /*
            *front를 더해주는 이유는 front가 0이 아닐 수 있기 때문
            *(a + b) % n  : a + b 가 0 ~ n-1 사이의 값이 나온다

            */
            int idx = (i + front) % capacity;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    //용량
    public int getCapacity() {
        return capacity;
    }

    //사이즈
    public int size() {
        return num;
    }

    //비어있는지 확인
    public boolean isEmpty() {
        return num <= 0;
    }

    //가득 차 있는지 확인
    public boolean isFull() {
        return num >= capacity;
    }

    //dump
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }

    //큐에서 논리 적으로 몇번째인지 검색
    public int search(int x) {
        for (int i = 0; i < num; i++) {
            //0 -> front , 1 -> front + 1, 2 -> front + 2  .... 
            if (que[(i + front) % capacity] == x) { 
                // 0번 부터 시작하기 때문에 + 1
                return i + 1;
            }
        }
        return 0;
    }
}
