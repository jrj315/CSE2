/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//Lab03
//Fundamentals of Programming ("Check")
//
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Check {
    //main method required for every Java program
    public static void main(String[] args)  {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        //here we are establishing the scanner for the input value for the original cost of the check
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /=100; //we want to convert the % to decimal value
        //here we are establishing the scanner for the input value for the tip percentage 
        System.out.print ("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        //here we are establishing the scanner for the input quantity of people who went out to dinner
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
                dimes, pennies; //for storing digits
                        //to the right of the decimal point
                        //for the cost$
        // here we are establishing all other values that will go into our calcuations as doubles and int's
        totalCost= checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        //get the whole amount, dropping decimal fraction
        //these equations above a two calculations one for total cost and the other for cost per person
        dollars=(int)costPerPerson;
        //this makes sure that dollar amount remains an int when establishing it is equal to costPerPerson as we are adding dimes and pennies separately
        //get dimes amount, e.g.,
        //(int)(6.73*10)%10->67%10->7
        //where the %(mod) operator returns the remainder
        //after the division: 583%100->83 27%5->2
        dimes=(int)(costPerPerson*10)%10;
        pennies=(int)(costPerPerson*100)%10;
        //here are the calculations for dimes and pennies converted into integer percents
        System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies);
        //here we are printing out the final product with dimes and pennies added after a decimal point to dollars
    } //end of main method       
} //end of class