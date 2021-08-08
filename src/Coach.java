public class Coach extends Person{
    boolean role;

    public Coach(String name, String lastName, int age, int CI, int phone, boolean role) {
        super(name, lastName, age, CI, phone);
        this.role=role;
    }
    public String  displayDataCoach(){
        return "Name:" + name + "\nLast Name:" +lastName+ "\nAge:" +age+ "\nCI:" +CI+ "\nPhone:" +phone+ "\nThere is Role:" +role;
    }

    public boolean isRole() {
        return role;
    }
}
