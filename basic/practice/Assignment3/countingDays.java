package basic.practice.Assignment3;

public class countingDays {

    public static boolean isLeapYear(int year) {
        
            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
                return true;
            }
            return false;
      
    }
    public static void main(String[] args) {
        int date = 7;
        int month = 5;
        int year = 1978;

        int inputDate = 15;
        int inputMonth = 5;
        int finalYear = 2022;
       
        
       
        
        int finalMonth =12;
        int finalDate = 30;
        int countingDays = 0;
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
                int count =0;
                for (int j2 = date; j2 <= finalDate; j2++) {

                    countingDays+=1;
                   count++;
                    
                }  
                System.out.println("from "+date+" to "+finalDate+" are " +count);   
                date =1;         
                
            }
            month = 1;
        }
        System.out.println(countingDays-1);

        
    }
    
}
