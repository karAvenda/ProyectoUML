public class Referee extends Person{
    boolean thereIsReferee;

    public Referee(boolean thereIsReferee, String name, String lastName, int age, int CI, int phone) {
        super(name,lastName,age,CI,phone);
        this.thereIsReferee = thereIsReferee;
    }

    public String  displayDataReferee(){
        return "There is Referee:" +thereIsReferee + "\nName:" + name + "\nLast Name:" +lastName+ "\nAge:" +age+ "\nCI:" +CI+ "\nPhone:" +phone;
       // if (thereIsReferee == false){
       //     System.out.println("There is not referee");
       // }
       // else {
       //     System.out.println("Name" + name + "Last Name" +lastName+ "Age" +age+ "CI" +CI+ "Phone" +phone);
       // }

    }
}
