package se.iths.philip.person;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void introduce() {
        System.out.print("Hej, jag heter " + name + ", ");
        System.out.print("är " + age + " gammal ");
        System.out.print("och bor i " + city + ".");
        System.out.println();
    }
}
