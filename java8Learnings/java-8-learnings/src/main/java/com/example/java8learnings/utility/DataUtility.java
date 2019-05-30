package com.example.java8learnings.utility;

import com.example.java8learnings.models.Person;

import java.util.ArrayList;
import java.util.List;

public class DataUtility {

    public static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Gandalf", 1959));
        personList.add(new Person("Bilbo", 50));
        personList.add(new Person("Thorin", 195));
        personList.add(new Person("Balin", 178));
        personList.add(new Person("Dwalin", 169));
        personList.add(new Person("Oin", 167));
        personList.add(new Person("Gloin", 158));

        personList.add(new Person("Bifur", 150));
        personList.add(new Person("Bofur", 150));
        personList.add(new Person("Dori", 150));
        personList.add(new Person("Nori", 150));
        personList.add(new Person("Ori", 150));
        personList.add(new Person("Bombur", 150));

        personList.add(new Person("Fili", 82));
        personList.add(new Person("Kili", 77));

        return personList;
    }

    public static List<String> getNameList() {

       List<String> nameList = new ArrayList<>();
        nameList.add("Gandalf");
        nameList.add("Bilbo");
        nameList.add("Thorin");
        nameList.add("Balin");
        nameList.add("Dwalin");
        nameList.add("Oin");
        nameList.add("Gloin");
        nameList.add("Bifur");
        nameList.add("Bofur");
        nameList.add("Dori");
        nameList.add("Nori");
        nameList.add("Ori");
        nameList.add("Bombur");
        nameList.add("Fili");
        nameList.add("Kili");

        return nameList;
    }

    public static List<String> getStringList() {

        List<String> stringList = new ArrayList<>();
        stringList.add("a1");
        stringList.add("b1");
        stringList.add("c1");

        stringList.add("a2");
        stringList.add("b2");
        stringList.add("c3");

        stringList.add("a3");
        stringList.add("b3");
        stringList.add("c2");

        return stringList;
    }




}


