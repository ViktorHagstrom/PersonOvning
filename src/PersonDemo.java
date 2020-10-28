public class PersonDemo {
    public static void main(String[] args) {

        Person p = new Person();
        p.firstName = "Viktor";
        p.lastName = "Hagström";
        p.dateOfBirth = "1992-06-28";
        p.height = 1.86;
        p.weight = 95;

        System.out.println(Person.getName(p));
        System.out.println(Person.getBMI(p));
        // System.out.println(Person.getAge(p));
        System.out.println(Person.getBMICategory(p));


    }
}
