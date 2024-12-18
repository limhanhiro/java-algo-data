package chapter4;

/**
 * 고정 길이 스택
 */
public class IntStack {
    
    private int[] stk; //스택용 배열
    private int capacity; //스택 용량
    private int ptr; //스택 포인터

    //실행 시 예외 (스택이 비어 있음)
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    //실행 시 예외 (스택이 가득 참)
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }


    //push : 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    //pop : 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    //peek : 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) pop과 달리 데이터를 꺼내지 않음
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }
    //clear : 스택을 비움
    public void clear() {
        ptr = 0;
    }

    //indexOf : 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x) {
        //정상 쪽에서 선형 검색
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //capacity : 스택의 용량을 반환
    public int capacity() {
        return capacity;
    }

    //size : 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }
    
    //isEmpty : 스택이 비어 있는지 확인
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //isFull : 스택이 가득 찼는지 확인
    public boolean isFull() {
        return ptr >= capacity;
    }

    //dump : 스택 안의 모든 데이터를 바닥 → 꼭대기 순으로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("emptyStack.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    //생성자
    public IntStack(int maxLen) {
        ptr = 0;
        this.capacity = maxLen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            //배열 생성 오류
            this.capacity = 0;
        }
    }
    

}
