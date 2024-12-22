package chapter5;

public class Hanoi {
    /**
     * 1번 기둥에 있는 n 개의 원반을 1,2,3  3번 기둥으로 옮기기
     * 
     * 조건:
     * 1. 한 번에 한 개의 원반만 옮길 수 있습니다.
     * 2. 더 큰 원반 위에 더 작은 원반을 놓을 수 없습니다.
     * 3. 2번 기둥(보조 기둥)을 사용할 수 있습니다.
     * 
     * 목표:
     * 최소 이동 횟수로 모든 원반을 3번 기둥으로 
     */

     static void move(int no, int x, int y) {
         if (no > 1) {
             move(no - 1, x, 6 - x - y);
         }

         //가장 근 원반(가장 아래에 있는)을 목표 기중으로 이동 한다
         System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮깁니다.");

         if (no > 1) {
             move(no - 1, 6 - x - y, y);
         }
     }

     public static void main(String[] args) {
        int tower = 3;
        move(tower, 1, 3);
        
     }
}
