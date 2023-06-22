package JAVAOOP;

public class Main {
    public static void main(String[] args) {
        /* Employee e1 = new Employee(); // Create Object
        e1.setId("1");
        e1.setName("Peter");
        e1.setSalary(25000.00);
        System.out.println("Name : "+e1.getName());
        //               Constructor
        Employee e2 = new Employee();
        e2.setId("2");
        e2.setName("John");
        e2.setSalary(36789.45);
        System.out.println("Name : "+e2.getName());

        Employee e3 = new Employee();
        e3.displayEmployee();
        */

        Employee e4=new Employee("4", "Jason", 50000.00);
        e4.displayEmployee();
        Employee e5=new Employee();
        Employee e6=new Employee("6", 18500.00);
        e6.displayEmployee();

    }
}
