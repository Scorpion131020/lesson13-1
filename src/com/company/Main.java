package com.company;

public class Main {

    public static void main(String[] args) {
        //по имени преобразовали в объект
        Apple a = Apple.valueOf("A");
        System.out.println(a.a);

        Apple с = Apple.valueOf("С");
        System.out.println(с.a);

//        Apple apple = Apple.B;
//        System.out.println(apple.A.compareTo(Apple.C));

//        System.out.println(apple == Apple.B);
//        System.out.println(apple.equals(Apple.B));


//        for (Apple value : Apple.values()) {
//            System.out.println(value.ordinal());
//        }

//        switch (apple) {
//            case A:
//                System.out.println("case A");
//                break;
//            case B:
//            case C:
//        }
    }
}