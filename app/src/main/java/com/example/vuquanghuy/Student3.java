package com.example.vuquanghuy;

import android.widget.Toast;

public class Student3 {
    int id;
    String name;

    public Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(111, "Viet");
        Student3 s2 = new Student3(222, "Tu");

        s1.displayInformation();
        s2.displayInformation();
    }
}
