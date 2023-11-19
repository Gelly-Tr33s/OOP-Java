public class personmainmain {
    public static void main(String[] args) {
        Person employee1 = new Person();

        employee1.setFirst("Employee");
        employee1.setMiddle("Worker");
        employee1.setLast("One");
        
        System.out.println("Name is: " + employee1.getFullName());
    }
}