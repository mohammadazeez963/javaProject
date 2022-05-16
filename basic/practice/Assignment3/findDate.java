package basic.practice.Assignment3;

import java.util.Scanner;

public class findDate {
    static Scanner sc = new Scanner(System.in);

    public static boolean isLeapYear(int year) {
        
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            return true;
        }
        return false;
  
    }
    public static void main(String[] args) {

        int date = 15;
        int month = 5;
        int year = 2022;

        System.out.println("Enter the no.of days: ");
        int days = sc.nextInt();
        int finalDate = 30;
        boolean a = true;

        while(a){

            for (int i = month; i <= 12; i++) {
                
                switch (i) {
                    case 1:
                        finalDate =31;
                        break;
                    case 2:
                        if (isLeapYear(year)) { finalDate = 29;
                            
                        } else { finalDate = 28;
                            
                        }
                        break;

                    case 3:
                        finalDate =31;
                        break;
                    case 4:
                        finalDate =30;
                        break;
                    case 5:
                        finalDate =31;
                        break;
                    case 6:
                        finalDate =30;
                        break;
                    case 7:
                        finalDate =31;
                        break;
                    case 8:
                        finalDate =31;
                        break;
                    case 9:
                        finalDate =30;
                        break;
                    case 10:
                        finalDate =31;
                        break;
                    case 11:
                        finalDate =30;
                        break;
                    case 12:
                        finalDate =31;
                        break;
                
                    default:
                        break;
                }

                for (int j = date; j <= finalDate; j++) {

                    days--;
                    if(days == 0){
                        System.out.println((j+1)+"/"+i+"/"+year);
                        System.exit(0);
                       
                    }
                                  
                }
               
                date = 1;
            }
            month = 1;
            year++;

          
        }
        
    }
}
