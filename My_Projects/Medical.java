package My_Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medical {
    private int empId;
    private String empName;
    private String designation;
    private int insuranceCoverage;
    private int remainingCoverage;
    private double experience;
      @Override
      public String toString() {
          return "Medical [designation=" + designation + ", empId=" + empId + ", empName=" + empName + ", experience="
                  + experience + ", insuranceCoverage=" + insuranceCoverage + ", remainingCoverage=" + remainingCoverage
                  + "]";

      
      }
      public Medical(int empId, String empName, String designation, int insuranceCoverage, int remainingCoverage,
              double experience) {
          this.empId = empId;
          this.empName = empName;
          this.designation = designation;
          this.insuranceCoverage = insuranceCoverage;
          this.remainingCoverage = remainingCoverage;
          this.experience = experience;
              }
} 
class EmpInfo{
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static Scanner sc3 = new Scanner(System.in);
    static Scanner sc4 = new Scanner(System.in);
    static Scanner sc5 = new Scanner(System.in);
    static Scanner sc6 = new Scanner(System.in);
    static Scanner sc7 = new Scanner(System.in);

    static List<Integer> id = new ArrayList<>();
    static List<String> name = new ArrayList<>();
    static List<String> desig = new ArrayList<>();
    static List<Integer> remain = new ArrayList<>();
    static List<Double> exp = new ArrayList<>();

    public static void HomePage() {
        while(true){
        System.out.println("1.Add an employee");
        System.out.println("2.Edit an employee");
        System.out.println("3.Fetch an employee");
        System.out.println("4.Exit the services");
        System.out.println();
        System.out.println("Please select your service: 1/2/3/4 ");

        int choice = sc.nextInt();
       
        switch (choice) {
            case 1:
            System.out.println();
                addEmp();
                break;
            case 2:
            System.out.println();
                editEmp();
                break;
            case 3:
            System.out.println();
            fetchEmp();
                break;
            case 4:
                System.out.println("Thanks for using our services");
                System.exit(0);
                break;
        
            default:
            System.out.println("Please enter correct input(1/2/3/4)");
                break;
         }
        }
    }

    public static void addEmp(){

        System.out.println("Enter Employee Id:");
        int checkId = sc1.nextInt();
        if (id.contains(checkId)==false) {
            id.add(checkId);
        

        System.out.println("Enter Employee Name:");
        name.add(sc2.nextLine());

        System.out.println("Enter Employee designation");
        desig.add(sc3.nextLine());

        System.out.println("Enter the Employee experience");
        exp.add(sc4.nextDouble());

        remain.add(200000);

        System.out.println();

         System.out.println("Employee added Succesfully");
            
        }

        else{
            System.out.println();
            System.out.println("Employee already Registered");}
        
         System.out.println();
         while(true){
            System.out.println("Press 1 to return homepage or 2 to exit the serives");
            int a = sc7.nextInt();
            switch (a) {
                case 1:
                System.out.println();
                    HomePage();
                    break;
                case 2:
                System.out.println("Thanks for using our services");
                    System.exit(0);;
                    break;
            
                default:
                System.out.println("Enter the correct input(1/2)");
                    break;
            }
          }

    }

    public static void editEmp(){
        int index = -1;
        System.out.println("Enter the Employee Id");
        int eId = sc5.nextInt();
        System.out.println();
        if(id.contains(eId)==true){
             index = id.indexOf(eId);
       
        
        System.out.println("Enter employee medical bill");
        int bill = sc6.nextInt();
        
        int newBill = 0;
 
        if(exp.get(index) < 3){
           newBill = (bill*95)/100;
        }
        else if(exp.get(index) >= 3 && exp.get(index) <= 6){
           newBill = (bill*85)/100;
        }
        else{
           newBill = (bill*80)/100;
        }

        System.out.println();
        System.out.println("Employee Name: "+name.get(index));
        System.out.println("Available coverage: "+remain.get(index));
        System.out.println("Employee bill: "+bill);
        System.out.println("Discount: "+(bill-newBill));
        System.out.println("Cost to employee: "+newBill);
        remain.add(index, (remain.get(index)-newBill));

        System.out.println("Remaining Coverage: "+remain.get(index));
    }
    
    else {System.out.println("Invalid employee details");}
    System.out.println();
        while(true){
        System.out.println("Press 1 to return homepage or 2 to exit the serives");
        int a = sc7.nextInt();
        switch (a) {
            case 1:
            System.out.println();
                HomePage();
                break;
            case 2:
            System.out.println();
            System.out.println("Thanks for using our services");
                System.exit(0);;
                break;
        
            default:

            System.out.println("Enter the correct input(1/2)");
                break;
        }
      }
    

  
    

        
     
    }


    public static void fetchEmp() {
        int inde = -1;
        System.out.println("Enter the Employee Id");
        int eId = sc5.nextInt();
        System.out.println();
        if(id.contains(eId)==true){
             inde = id.indexOf(eId);
        
        System.out.println("Employee Name: "+name.get(inde));
        System.out.println("Employee Designation: "+desig.get(inde));
        System.out.println("Employee Experiance: "+exp.get(inde)+" years");
        System.out.println("Total coverage: 200000");
        System.out.println("Remaing coverage: "+remain.get(inde));

        
        }

        else{System.out.println("Invalid employee Details");}
        System.out.println();
        while(true){
            System.out.println("Press 1 to return homepage or 2 to exit the serives");
            int a = sc7.nextInt();
            switch (a) {
                case 1:
                System.out.println();
                    HomePage();
                    break;
                case 2:
                System.out.println();
                System.out.println("Thanks for using our services");
                    System.exit(0);;
                    break;
            
                default:
                System.out.println("Enter the correct input(1/2)");
                    break;
            }
          }
        
       
    }

    public static void main(String[] args) {
       HomePage();
        

    }
}
