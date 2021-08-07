public class Player extends Person {
    String position;
    int tShirtNumber;
    double height;
    double weight;

    public Player(String name, String lastName, int age, int ci, int phone,String position, int tShirtNumber,double height,double weight) {
        super(name, lastName, age, ci, phone);
        this.position = position;
        this.tShirtNumber=tShirtNumber;
        this.height=height;
        this.weight=weight;
    }


    String displayDataPlayer(){
        return "Name:" + name+
                "\nLast Name:" +lastName+
                "\nAge:" + age+
                "\nCI:" + CI+
                "\nPhone:" + phone+
                "\nPosition:" + position+
                "\nt-shirtNumber:" + tShirtNumber+
                "\nHeight:" + height+
                "\nWeight:" + weight;
    }

    public String getPosition() {
        return position;
    }

    public int getTShirtNumber() {
        return tShirtNumber;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
