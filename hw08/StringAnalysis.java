/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw08
//StringAnalysis
//
//
//user enters string of numbers and letters
//program determines # of characters in string and 
//if there are letters
//program lets user choose if here or she wants to examine
//all the chars or just a certain number
//two methods that both return a boolean
//one accepts int the other a string
//
//(probably one is for all the letters the other for just a certain amount
//of them)
//
//stringName.char(int i) returns the character in position i of the string
//

import java.util.Scanner;//imports scanner function
 
public class StringAnalysis {//start of class
    
    public static void main(String[] args)  {//start of main method
    
    Scanner scanner =new Scanner(System.in);//establish scanner
    String Yes = new String("yes");//establish string value for "yes" choice
    String No = new String("no");//establish string value for "no" choice
    int length = 0;//establish length
    
    System.out.println("Please enter a string: ");//prints user prompt
    String input = scanner.nextLine();//establish variable for scanner string input
    System.out.println("examine all letters (enter: yes) or only a certain number (enter: no)?");//prints user prompt for specific program function
    String choice = scanner.next();//sets variable to scanner for yes or no choice
        if (choice.equals(Yes)){//if user enter's "yes" letters method is enacted without limit on variables.
            letters(input);
            
            
            
        
            
            
        }
        if (choice.equals(No)){//if user enters "no" scanner s set for amount of char's to be examined (amount) based on the input of chars
            System.out.println("Please enter how many letters to be examined");
            int amount = scanner.nextInt();
            letters(input, amount);
            
    
    
        }
        
    
    
    }
    
    public static void letters(String input) {//method for if user enters "yes"
        
        int count=0;//identifying "count" for for loop
        
        
        for (int i = 0; i<input.length(); i++){//for loop with i<input length as there is no specification on length for this method
            
            if (Character.isLetter(input.charAt(i))){//if statement to count the amount of char's that are actually letters. no else statement needed as all other char types are disreguarded.
                count++;
            }
        }
        
        
        System.out.println("You have "+count+" characters that aren't letters");//might aswell just print within the method as it is a different print than the "no" method.
        
    }
    
    public static void letters(String input, int amount) {//method for if user enters "no" which has both the string input and integer amount of letters specified. 
        
        int count=0;
        
        for (int i = 0; i<amount; i++){//for loop that ends when incremented "i" reaches the "amount" specified.
            
            if (Character.isLetter(input.charAt(i))){//if statement to count the amount of char's that are actually letters. no else statement needed as all other char types are disreguarded.
                count++;
            }
        }
        
        
        System.out.println("You have "+count+" characters that aren't letters given "+amount+" letters to be examined");//might aswell just print within the method as it is a different print than the "yes" method.
        
         
    }
    
    
    
    
    
        
        
    
}

