public class Employee extends Person{
    private String strEmpID; // Employee Number
    private double dblEmpSalary; // Basic salary

    public Employee() {} // public Employee
    public Employee(String tstrLast, String tstrFirst, String tstrtMiddle, String tstrEmpID, double dblEmpSalary) {
        super(tstrLast, tstrFirst, tstrtMiddle);
        this.strEmpID = tstrEmpID;
        this.dblEmpSalary = dblEmpSalary;
    }

    public void setEmpID(String tstrEmpID) {
        this.strEmpID = tstrEmpID;
    }

    public void setEmpSalary(double dblEmpSalary) {
        this.dblEmpSalary = dblEmpSalary;
    }

    public String getEmpID() {
        return this.strEmpID;
    }

    public double getEmpSalary() {
        return this.dblEmpSalary;
    }
    // @Override 
    public String getInfo() {
        return "ID: " + this.strEmpID + " | " + "Name: " + super.getInfo() + " | " + "Salary: " + this.dblEmpSalary;
    }
}