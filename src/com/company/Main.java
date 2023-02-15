package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Animal> list = new LinkedList<>();
        LinkedList<Animal> catList = new LinkedList<>();
        LinkedList<Animal> linkedList = new LinkedList<>();
        List<Object> arrayList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(new Cat(random.nextInt(1, 20)));
            list.add(new Dog(random.nextInt(1, 25)));
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Cat) {
                count++;
            }
            if (count == 5) {
                list.remove(list.get(i));
                count =0;
            }

        }
        count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Dog) {
                count++;
            }
            if (count == 3) {
                list.add(i + 1, new Mouse(random.nextInt(1, 10)));
                count = 0;

            }
                   }
        count=0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) instanceof Cat) {
                if (list.get(i - 1) instanceof Mouse || list.get(i + 1) instanceof Mouse) {
                    catList.add(list.get(i));
                    list.remove(list.get(i));
                }
            }
        }

        arrayList.add(catList);

        catList.clear();

        int c = 0;
        int d = 0;
        int m = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Cat){
                c += list.get(i).getAge();
            }
            if (list.get(i) instanceof Dog){
                d += list.get(i).getAge();
            }
            if (list.get(i) instanceof Mouse){
                m += list.get(i).getAge();
            }

        }
        System.out.println("Cats age " +c);
        System.out.println("Dogs age " +d);
        System.out.println("Mouses age " +m);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Cat){
                linkedList.addFirst(list.get(i));
            }
             if (list.get(i) instanceof Dog){
                linkedList.addLast(list.get(i));
            }

        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)instanceof Mouse){
                linkedList.add(list.get(i));
            }

        }
        for (Animal animal: linkedList){
            System.out.println(animal);
        }

    }



}

