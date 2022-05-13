package basic.practice;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class medicalShop{

    static Queue<Details> q = new ArrayDeque<>();
    static Map<String,String> m = new HashMap<>();
    static Scanner sn = new Scanner(System.in);
    static Scanner sn1 = new Scanner(System.in);
    static Scanner sn2 = new Scanner(System.in);
    static Scanner sn3 = new Scanner(System.in);

    public static Details addDetails(){

        System.out.println("Pleae eneter the id: ");
        int i = sn.nextInt();

        System.out.println("Please eneter the Name: ");
        String s = sn1.nextLine();

        System.out.println("Please eneter the disease");
        String d = sn2.nextLine();

        System.out.println("Please enter the age: ");
        int a = sn.nextInt();

        Details patient = new Details(i,s,d,a);
        System.out.println("Patient added succesfully");

        return patient;

       
    }

    public static void main(String[] args) {
        Details d = addDetails();
        m.put("Id",""+d.getPatientId());
        m.put("Name",d.getPatientName());
        m.put("Disease",""+d.getDisease());
        m.put("Age",""+d.getAge());



        System.out.println();
        System.out.println(m);
        System.out.println();
        System.out.println("Patient id: "+d.getPatientId());
        System.out.println("Patient Name: "+d.getPatientName());
        System.out.println("Patient Disease: "+d.getDisease());
        System.out.println("Patient Age: "+d.getAge());
        

  }
}


class Details{
    int patientId;
    String patientName;
    String disease;
    int age;
    @Override
    public String toString() {
        return "details [age=" + age + ", disease=" + disease + ", patientId=" + patientId + ", patientName="
                + patientName + "]";
    }


    //getter and setters
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    //constructor
    public Details(int patientId, String patientName, String disease, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
        this.age = age;
    }
    

    
    
   }
