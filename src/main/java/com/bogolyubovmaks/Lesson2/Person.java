package com.bogolyubovmaks.Lesson2;

public class Person {
    String fullName;
    int age;
    static int id;

    //Конструктор без параметров
    public Person()
    {
        id += 1;
    }

    //Конструктор с параметрами
    public Person(String fullName,int age)
    {
        id += 1;
        this.fullName = fullName;
        this.age = age;
    }

    void talk() {
        if (fullName != null && age != 0 && id != 2 && !fullName.isEmpty()) {
            System.out.println("Привет я " + fullName + " и мне " + age + " лет ");
        } else if (fullName != null && age != 0 && id == 2 && !fullName.isEmpty()) {
            System.out.println("Привет я, " + fullName + ", избранный");
        }
    }

    //Узнать количство объектов
    static void count(){
        System.out.println("Создано " + id + " объектов");
    }

    //Заполнить данные для конструктора без параметров
    void setPerson(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}

