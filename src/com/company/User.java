package com.company;

import java.util.Comparator;

public class User implements Comparable<User>{
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


   public static Comparator<User> compareByName = new Comparator<User>() {
       @Override
       public int compare(User o1, User o2) {
           return o1.name.compareTo(o2.name);
       }
   };

    public static Comparator<User> compareById = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o2.id-o1.id;
        }
    };








    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +"\n";
    }

    @Override
    public int compareTo(User o) {
        return this.age-o.age;
    }
}
