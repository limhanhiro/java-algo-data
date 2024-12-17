package chapter1;

public class Q12 {
    public static void main(String[] args) {
        System.out.printf("   |");
        for(int i=1; i<10; i++) {
            System.out.printf("%3d" , i);
        }
        System.out.println("\n---+---------------------------");
        for(int i=1; i<10; i++) {
            System.out.printf("%2d |" , i);
            for(int j=1; j<10; j++) {
                System.out.printf("%3d" ,i + j);
            }
            System.out.println();
        }
    }
}
