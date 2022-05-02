package basic;

public class empData {

    @Override
    public String toString() {
        return "empData [empId = " + empId + ", empName = " + empName + ", location = " + location + ", department = " + department + "]";
    }
    private int empId;
    private String empName;
    private String location;
    private String department;
    
    // setter methods

    public void setEmpId(int empNo) {
        this.empId= empNo;
    }

    public void setEmpName(String name) {
        this.empName = name;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }
    public void setDepartment(String dep) {
        this.department = dep;
    }

    // getter methods

    public int getEmpId () {
       return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public String getLocation() {
        return location;
    }
    public String getDepartment(){
        return department;
    }


    // parameterized constructor
    public  empData(int empId, String empName, String department, String location){
        this.empId = empId;
        this.department = department;
        this.empName = empName;
        this.location = location;
    }

    public static void main(String[] args) {

        //object for default constructor
        empData obj = new empData(1001, "Azeez", "IT", "Hyderabad");
        empData obj1 = new empData(1002, "Param", "HR", "Bangalore");

        System.out.println(obj);
        System.out.println(obj1);

        //getter methods

        System.out.println(obj.getEmpName());
        System.out.println(obj1.getLocation());

    }
}


        