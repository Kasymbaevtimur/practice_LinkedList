package com.company;

public class Mouse extends Animal{
    public Mouse(int age) {
        super(age);
    }
    @Override
    public String toString() {
        return "Mouse  "+getAge();
    }
}
