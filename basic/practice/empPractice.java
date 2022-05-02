package basic.practice;

import java.util.Scanner;

public class empPractice {
    int empId;
    String empName;
    String department;
    String location;
    double costToCompany;

    //getters and setters

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getCostToCompany() {
        return costToCompany;
    }
    public void setCostToCompany(double costToCompany) {
        this.costToCompany = costToCompany;
    }

    // toString method

    @Override
    public String toString() {
        return "empPractice [costToCompany=" + costToCompany + ", department=" + department + ", empId=" + empId
                + ", empName=" + empName + ", location=" + location + "]";
    }

    // constructor

    public empPractice(int empId, String empName, String department, String location, double costToCompany) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.location = location;
        this.costToCompany = costToCompany;
    }

}

class addEmp{

        static Scanner sc = new Scanner(System.in);
        static Scanner sc1 = new Scanner(System.in);
        static Scanner sc2 = new Scanner(System.in);
        static Scanner sc3 = new Scanner(System.in);
        static Scanner sc4 = new Scanner(System.in);
        static Scanner sc5 = new Scanner(System.in);

        private static empPractice addEmployee(){
            System.out.println("Enter the EmpId");
            int id = sc1.nextInt();

            System.out.println("Enter the Name");
            String name = sc2.nextLine();

            System.out.println("Enter the depaetment");
            String dept = sc3.nextLine();

            System.out.println("Enter the location");
            String loc = sc4.nextLine();

            System.out.println("Enter the CTC");
            double CTC = sc5.nextDouble();

            empPractice e = new empPractice(id, name, dept, loc, CTC);
            System.out.println("Employee added successfully");
            System.out.println(e);
            return(e);


        }
   
    public static void main(String[] args) {

        System.out.println("Enter your input(must be 1 or 2)");
         
        while (true) {
            System.out.println("1. Add the employee");
        System.out.println("2. Exit from the Programme");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                addEmployee();
                
                break;
            case 2:
                System.out.println("Thanks! for using our services");;
                System.exit(0);
                
                break;
        
        
            default:
            System.out.println("Enter the correct Input(1 or 2)");
                break;
        }
            
        }
        
    }
}

   
    

