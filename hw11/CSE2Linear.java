/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw11
//Linear 
//11/1/2015
//
//
import java.util.Random;//import needed util's
import java.util.Scanner;
public class CSE2Linear{//main method
    public static void main(String[] args) {//set main string in which user inputs the grades
        Scanner scan = new Scanner(System.in);//initialize scanner.
        grades = new int[15];//set value for input of grades
        int search = 0;//initialize grade entered to be searched for
        int counter = 0;
        for (i=0; i<15; i++){//for loop to properly input the list of grades
            System.out.println("Enter 15 ints for final grades in CSE2: ");//prompt user for input
            grades[i] =scan.nextInt();//set grades array to be next scanned int
            view(grades);//call view method to analyze grade input
        }
        
    }
    
    public static void view(String[] grades) {//analyzes input on a loop to determine if search matches grades
        
        
        boolean validInput = false;//start infinite loop for viewing
        while(validInput = false){
            for (int i = 0; i < 15; i++) {//view if search matches anything listed in grades
                System.out.println("Enter a grade to binary search for: ");//prompt user
                search = scan.nextInt;//set search to be next int scanned
                if (grades[i] == search) {//set if statement for actions preceding if there is a match or not
                    validInput = true;//finish loop if search==grades[i]
                    System.out.println(search+"was found within the array and "+i+"comparisons were made");
                    
                }
                if (i==15){//if no match scramble grades array and continue to next search input
                    System.out.println(search+"was not found within the grades entered");//let user know it was not found
                    scramble(grades);
                    printArray(grades);
                    
                    
                }
            }
        }   
    }
        
    }
    
    public static void scramble(String[] grades){//method to scramble the grades
        for (int i =0; i<15; i++); {//for loop for scrambling
            int target = (int)(grades.length*Math.random());//necessary statements for randomizing an array
            int temp = grades[target];
            grades[target] = grades[i];
            grades[i] = temp;
            System.out.println("Scrambled");//let user know grades were scrambled
    }
    public static void printArray(String[] grades) {//method for reprinting the array of grades
        for (int i = 0; i < 15; i++) {
        grades[i]=1;
        System.out.print(grades[i] + " ");
        }
    }
    
    