package chapter3;

// Comparable 인터페이스를 구현하는 클래스
class Fruit implements Comparable<Fruit> {
    String fruit;
    int price;


    public Fruit(String fruit, int price) {
        this.fruit = fruit;
        this.price = price;
    }


    // 나이를 기준으로 오름차순 정렬
    // compareTo 메서드를 오버라이딩
    //Arrays.sort() 메서드를 사용할 때 정렬 기준을 정의 할수 있음
    @Override
    public int compareTo(Fruit other) {
        //this 가 other 보다 크면 양수를 반환
        //this 가 other 보다 작으면 음수를 반환
        //this 가 other 와 같으면 0을 반환
        return Integer.compare(this.price,other.price);
    }



}


/**
 * 자연 정렬 이 되지 않는 클래스 : Comparable 인터페이스를 구현하지 않은 클래스
 * Comparable 인터 페이스를 구현한 클래스만 Arrays.sort() 메서드를 사용할 수 있음
 * 종류 : String, Integer, Double, Date, File, Path, URI, URL 등등....
 */

public class Q7 {

    public static void main(String[] args) {
        Fruit[] fruits = {
            new Fruit("apple", 18),
            new Fruit("banana", 22),
            new Fruit("kiwi", 33),
            new Fruit("grape", 45),
            new Fruit("orange", 23),
        };

        // 나이 순으로 정렬
        java.util.Arrays.sort(fruits);

        for (Fruit f : fruits) {
            System.out.println(f.fruit + " : " + f.price);
        }
    }

    
}
