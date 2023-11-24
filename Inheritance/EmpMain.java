public class EmpMain {
    public static void main(String[] args) {
        Person objP1 = new Person("Castrence", "Michael", "Culumeda");
        Employee objE1 = new Employee("Lavares", "Bernico", "Balderosa", "02330004", 45000);

        System.out.println(objP1.getInfo());
        System.out.println(objE1.getInfo());
    }
}