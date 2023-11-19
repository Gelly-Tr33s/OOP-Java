public class PersonMain {

    public static void main(String[] args) {

        Person objPerson1 = new Person();  // instantiation - creating an object based from a class

        /* this will generate an error if the property is "private"
        objPerson1.strFirst = "Michael";
        objPerson1.strMiddle = "Culumeda";
        objPerson1.strLast = "Castrence";

        System.out.println("Full name of objPerson1: " + 
                           objPerson1.strLast + ", " +
                           objPerson1.strFirst + " " +
                           objPerson1.strMiddle);
        */

        objPerson1.setFirst("Michael");
        objPerson1.setMiddle("Culumeda");
        objPerson1.setLast("Castrence");       

        System.out.println("Fullname of objPerson1 is " +
                           objPerson1.getLast() + ", " +
                           objPerson1.getFirst() + " " +
                           objPerson1.getMiddle());

        Person objPerson2 = new Person();

        /*
        objPerson2.strFirst = "Jennifer";
        objPerson2.strMiddle = "Castro";
        objPerson2.strLast = "Santos";
        */

        objPerson2.setFirst("Jennifer");
        objPerson2.setMiddle("Castro");
        objPerson2.setLast("Santos");

        System.out.println("objPerson2 name: " + 
                           objPerson2.getFullName());

        Person objPerson3 = new Person("Lavares", "Bernico", "Balderosa");

        System.out.println("Fullname of objPerson3 is " +
                           objPerson3.getFullName());


    }  // public static void main(String[] args)

}  // public class PersonMain