package chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    private String name;
    private int height;
    private int balance;

    public Person(String name, int height, int balance) {
        this.name = name;
        this.height = height;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getBalance() {
        return this.balance;
    }


    //키 내림차순
    public static final Comparator<Person> HeightOrderDESC = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return Integer.compare(p2.height, p1.height);
            
        }
    }

    //잔고 오름차순
    public static final Comparator<Person> BalanceOrderASC = new BalanceOrderComparator();

    private static class BalanceOrderComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.balance, p2.balance);
            // return p1.balance < p2.balance ? -1 : p1.balance > p2.balance ? 1 : 0;
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Person[] members = {
                new Person("AA", 180, 10000),
                new Person("BB", 177,20000),
                new Person("CC", 164, 15000),
                new Person("DD", 190, 17000),
                new Person("EE", 202, 30000),
        };

        Arrays.sort(members, Person.BalanceOrderASC);

        System.out.println("잔고 오름 차순 으로 정렬");
        for (int i=0; i<members.length; i++) {
            System.out.println(members[i].getName()+" "+members[i].getHeight()+" "+members[i].getBalance());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 잔고를 입력하세요.");
        int balance = sc.nextInt();
        int idx = Arrays.binarySearch(members, new Person("", 0, balance), Person.BalanceOrderASC);
        if(idx < 0) {
            System.out.println(balance+ " 잔고 없습니다.");
        } else {
            System.out.println("해당 요소는 "+idx+"에 있습니다.");
            System.out.println("이름: "+members[idx].getName()+"\n 키: "+members[idx].getHeight() + "\n 잔고: "+members[idx].getBalance());
        }

        Arrays.sort(members, Person.HeightOrderDESC);

        System.out.println("키 내림차순 정렬");
        for (int i=0; i<members.length; i++) {
            System.out.println(members[i].getName()+" "+members[i].getHeight()+" "+members[i].getBalance());
        }

        
        System.out.println("검색할 키를 입력하세요.");
        int height = sc.nextInt();
        int idx2 = Arrays.binarySearch(members, new Person("", height, 0), Person.HeightOrderDESC);
        if(idx2 < 0) {
            System.out.println(height+ " 키 없습니다.");
        } else {
            System.out.println("해당 요소는 "+idx2+"에 있습니다.");
            System.out.println("이름: "+members[idx2].getName()+"\n 키: "+members[idx2].getHeight() + "\n 잔고: "+members[idx2].getBalance());
        }

    }
    
}
