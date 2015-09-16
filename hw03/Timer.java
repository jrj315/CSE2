/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw03
//Scanner Java Programs
//Program 1
//
import java.util.Scanner;
public class Timer{

//  add main method
    public static void main(String[] args)  {
        
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt();
        // Setting scanner for current time (as an integer)
        System.out.print("Enter the time you will be eating dinner: ");
        int dinnerTime = myScanner.nextInt();
        // Setting scanner for dinner time (as an integer)
        int currentHour = currentTime/100;
        int currentMinute = currentTime%100;
        // Separating the hours and minutes of current time using int= x/100 to recieve and int =%100
        //to recieve separate hours and minutes values
        int dinnerHour = dinnerTime/100;
        int dinnerMinute = dinnerTime%100;
        // Separating the hours and minutes of dinner time using the same method
        int differenceHours = dinnerHour-currentHour;
        // Calculating the difference in hours between now and dinner and setting it as an integer 
        int differenceMinutes = dinnerMinute-currentMinute;
        //Calculating the difference in minutes between now and dinner and setting it as an integer 
        System.out.println("You have "+differenceHours+" hours and "+differenceMinutes+" minutes until dinner.");
        //Printing these two values as a result of what was entered. 
    }//end of main method
}//end of class