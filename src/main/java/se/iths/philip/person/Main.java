package se.iths.philip.person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Philip", 33, "Stockholm");

        person.introduce();

        person.setName("Adam");
        person.getName();
        person.setAge(34);
        person.getAge();
        person.setCity("Uppsala");
        person.getCity();
        person.introduce();

    }
}
