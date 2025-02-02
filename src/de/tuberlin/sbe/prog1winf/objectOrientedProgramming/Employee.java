package de.tuberlin.sbe.prog1winf.objectOrientedProgramming;

import java.util.Objects;

public class Employee {
    static long nextID = 0;

    // the assignment should go into a constructor
    //private long employeeID = nextID++;
    private long employeeID = -1;
    private String firstName;
    private String lastName;

    //…
//    public static void main(String[] args) {
//        Employee.nextID=7;
    //        Employee emplA = new Employee();
      //  emplA.print();
        //Employee emplB = new Employee();
        //emplB.print();
    //}

    private void print() {
//        long employeeID = 0;
//        System.out.println("EID: " + employeeID);
//        System.out.println("EID: " + this.employeeID);
        System.out.println("EID: " + this.employeeID + ", Name: " + this.firstName + " " + this.lastName);
    }

    public long getEmployeeID() {
        return employeeID;
    }
//
//    public void setEmployeeID(long employeeID) {
//        this.employeeID = employeeID;
//    }
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(employeeID);
//    }

    //    long employeeID;
//    String lastName;
//    String firstName;


    public Employee(String firstName, String lastName) {
        if (firstName == null || firstName.length() <= 0
                || lastName == null || lastName.length() <=0) {
            System.out.println("Please provide first and last name");
        }
        this.employeeID = Employee.nextID++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Employee emplA = new Employee("Ada", "Lovelace");
        Employee emplB = new Employee("Donald", "Knuth");
        emplA.print();
        emplB.print();

        // Say they got married...
        emplB.setLastName(emplA.lastName);
        emplA.print();
        emplB.print();
        System.out.println(emplA.equals(emplB));
    }
}
