package basic.practice.Assignment3;

import basic.practice.Assignment1.M;

public class countingDMY {
    public static boolean isLeapYear(int year) {
        
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            return true;
        }
        return false;
  
    }
    public static void main(String[] args) {
        int date = 15;
        int month = 5;
        int year = 2001;
    
        int inputDate = 15;
        int inputMonth = 5;
        int finalYear = 2022;
       
        
       
        
        int finalMonth =12;
        int finalDate = 30;
        int countingDays = -1;

        int D = 0;
        int M = 0;
        int Y = 0;

        for (int i = year; i <= finalYear ; i++) { 
    
            if(i == finalYear){finalMonth = inputMonth;}            
            for (int j = month; j <= finalMonth; j++) {
                
                
                
    
                switch (j) {
                    case 1:
                        finalDate =31;
                        break;
                    case 2:
                        if (isLeapYear(i)) { finalDate = 29;
                            
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
                if(i == finalYear && j == finalMonth){finalDate = inputDate;}
                
                for (int j2 = date; j2 <= finalDate; j2++) {
    
                    countingDays+=1;
                    D++;
                  if (D == finalDate) {
                      D = 0;
                      M++;
                  }
                  if (M == 12) {
                      M = 0;
                      Y++;
                      
                  }
                    
                }  
                 
                date =1;         
                
            }
            month = 1;
        }
        System.out.println(Y+" years "+M+" months "+D+" days");
    
        
    }
}
