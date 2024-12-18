package chapter4;

public class DoubleStack {
    private int capacity; // 스택 용량
    private int ptrA; // 스택 포인터
    private int ptrB; // 스택 포인터
    private int[] stk; // 스택 본체

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    // 생성자
    public DoubleStack(int maxLen) {
        ptrA = 0;
        capacity = maxLen;
        ptrB = capacity - 1;
        
        try {
            stk = new int[capacity]; 
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public int pushA(int x) throws OverflowIntStackException {
        // 스택이 가득 차 있는 경우
        if (ptrA >= ptrB + 1) {
            throw new OverflowIntStackException();
        }
        return stk[ptrA++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int popA() throws EmptyIntStackException {
        if (ptrA <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptrA];
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) pop과 달리 데이터를 꺼내지 않음
    public int peekA() throws EmptyIntStackException {
        if (ptrA <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptrA - 1];
    }

    // 스택을 비움
    public void clearA() {
        ptrA = 0;
    }


    // 스택에 x를 푸시
    public int pushB(int x) throws OverflowIntStackException {
        // 스택이 가득 차 있는 경우
        if (ptrB - 1 <= ptrA) {
            throw new OverflowIntStackException();
        }
        return stk[ptrB--] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int popB() throws EmptyIntStackException {
        if (ptrB >= capacity) {
            throw new EmptyIntStackException();
        }
        return stk[++ptrB];
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) pop과 달리 데이터를 꺼내지 않음
    public int peekB() throws EmptyIntStackException {
        if (ptrB >= capacity) {
            throw new EmptyIntStackException();
        }
        return stk[ptrB + 1];
    }

    // 스택을 비움
    public void clearB() {
        ptrB = capacity - 1;
    }



    // 스택 용량
    public int capacity() {
        return capacity;
    }

    // 스택에 쌓여 있는 데이터 수
    public int sizeA() {
        return ptrA;
    }

    // 스택에 쌓여 있는 데이터 수
    public int sizeB() {
        return capacity - ptrB - 1;
    }
    
}
