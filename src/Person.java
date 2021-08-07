public class Person {
    String name;
    String lastName;
    int age;
    int CI;
    int phone;

    public Person(String name, String lastName, int age, int CI, int phone) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.CI = CI;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getCI() {
        return CI;
    }

    public int getPhone() {
        return phone;
    }
}
