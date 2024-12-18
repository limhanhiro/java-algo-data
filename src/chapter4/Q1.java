package chapter4;

public class Q1 {

    public static void main(String[] args) {
        // IntStack stack2 = new IntStack(64);

        Stack<Integer> stack = new Stack<>(64);

        System.out.println(true);
        System.out.println(stack.isEmpty());

        System.out.println("-------------------------------------");

        stack.push(4);
        stack.push(5);

        System.out.println(true);
        System.out.println(stack.isEmpty());

        System.out.println("-------------------------------------");

        System.out.println(0);
        System.out.println(stack.push(0));

        System.out.println("-------------------------------------");

        System.out.println(0);
        System.out.println(stack.peek());

        System.out.println("-------------------------------------");

        System.out.println(3);
        System.out.println(stack.size());

        System.out.println("-------------------------------------");
        
        System.out.println(0);
        System.out.println(stack.pop());

        System.out.println("-------------------------------------");

        System.out.println(2);
        System.out.println(stack.size());

        System.out.println("-------------------------------------");

        System.out.println(64);
        System.out.println(stack.capacity());

        System.out.println("-------------------------------------");

        System.out.println(false);
        System.out.println(stack.isFull());

        System.out.println("-------------------------------------");

        System.out.println(-1);
        System.out.println(stack.indexOf(123));


        System.out.println("-------------------------------------");

        System.out.println("4"+" 5");
        stack.dump();

        System.out.println("-------------------------------------");
        stack.clear();
        System.out.println("스택을 비웠습니다.");
        System.out.println(true);
        System.out.println(stack.isEmpty());
        
    }
    
}
