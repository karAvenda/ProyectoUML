public class Main {
    public static void main(String [] args){
        System.out.println("<<Data of a person>>");
        Person dataPerson = new Person("Sofia","Campos",18, 1234567,121212);
        System.out.println("Name: " + dataPerson.getName());
        System.out.println("Last name: "+dataPerson.getLastName());
        System.out.println("Age: "+dataPerson.getAge());
        System.out.println("CI: "+dataPerson.getCI());
        System.out.println("Phone: "+dataPerson.getPhone());
        System.out.println();

        System.out.println("<<Data of a Player>>");

        Player dataPlayer = new Player("Carla","Rios",22,111111,1234567,"front-left",4,1.67,60.5);
        System.out.println(dataPlayer.displayDataPlayer());
        System.out.println();

        System.out.println("<<Data of a Referee>>");

        Referee dataReferee = new Referee(true,"Francisco","Perez",28,333333,4545454);
        System.out.println(dataReferee.displayDataReferee());
        System.out.println();

        System.out.println("<<Data of Volley Ball Court>>");

        VolleyBallCourt dataCourt = new VolleyBallCourt("18 m x 9m","Bolivar",2344);
        System.out.println(dataCourt.displayDataCourt());
    }


}
