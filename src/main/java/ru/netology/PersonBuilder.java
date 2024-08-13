package ru.netology;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    private int age() {
        return this.age;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        if (age() > 0 && age() < 110) {
            return this;
        } else if (age() <= 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным или равен 0");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Недостаточно данных, вероятно вы не ввели имя и/или фамилию");

        } else return new Person(name, surname, age, address);
    }
}
