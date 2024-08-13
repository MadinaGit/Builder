package ru.netology;

import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    public boolean hasAge() {
        if (age != 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public void happyBirthday() {
        if (hasAge() == true) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(this.surname);
        builder.setAddress(this.address);
        builder.setAge(13);
        return builder;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " лет " + address;
    }

    @Override

    public int hashCode() {
        return Objects.hash(name, surname);
    }
}



