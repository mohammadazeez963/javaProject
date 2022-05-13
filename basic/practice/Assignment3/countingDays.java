package basic.practice.Assignment3;

public class countingDays {

    public static boolean isLeapYear(int year) {
        
            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
                return true;
            }
            return false;
      
    }
    public static void main(String[] args) {
        int date = 1;
        int month = 1;
        int year = 2021;

        int inputDate = 1;
        int inputMonth = 1;
        int finalYear = 2022;
       
        
       
        
        int finalMonth =12;
        int finalDate = 30;
        int countingDays = 0;
        for (int i = year; i <= finalYear ; i++) { 

            if(year == finalYear){finalMonth = inputMonth;}            
            for (int j = month; j < finalMonth; j++) {
                
                
                

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
                if(year == finalYear && month == finalMonth){finalDate = inputDate;}
                for (int j2 = date; j2 < finalDate; j2++) {

                    countingDays++;
                   
                    
                }      
                date =1;         
                
            }
           // month = 1;
        }
        System.out.println(finalMonth);

        
    }
    
}
