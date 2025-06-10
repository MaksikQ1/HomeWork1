package com.bogolyubovmaks.Lesson2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Иван", 18);
        person.talk();

        Person person1 = new Person("Борис", 22);
        person1.talk();

        Person person2 = new Person("Серго", 25);
        person2.talk();
    }

}
