package ru.netology;

public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Галина")
                .setSurname("Бланка")
                .setAge(45)
                .setAddress("Нью Йорк")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Алеша")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
