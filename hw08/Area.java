/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw08
//Area
//
//
import java.util.Scanner;//import scanner
 
public class Area {
 
    public static void main(String[] args) {//set main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of circle");//print code prompt
        System.out.println("Area of triangle");
        System.out.println("Area of rectangle");
        System.out.print("Enter your choice: ");
        
        String choice = scanner.nextLine();//set variable equal to scanner for choice
        String rect = new String("rectangle");//set three possible choices to be entered
        String triang = new String("triangle");
        String circ = new String ("circle");
        
        boolean acceptable = false;//set boolean value for infinity loop
        
        while (!acceptable){//start loop to ask again given invalid choice input
        
        
            if (choice.equals(rect)){//set if statement for if "rectangle" is entered.
                
                System.out.print("Enter length: ");//print prompt to enter length
                
                while (!acceptable){//start loop to ask again given invalid length input
                
                    if (scanner.hasNextDouble){//set if statement if correct length is entered
                        
                        double length = scanner.nextDouble();//if valid input set length equal to input
                        System.out.print("Enter width: ");//print prompt for width given valid length input
                        
                        if (scanner.hasNextDouble){//set if statement if correct width is entered
                        
                            double width = scanner.nextDouble();//if valid input set width equal to input
                            double areaOfRectangle = area(length, width);//uses area method below for rectangle to find area given input
                            System.out.println("Area = " + areaOfRectangle);//print out area calculated
                            acceptable=true;//end infinite loop
                        }//end of if statement
                            
                        
                        else{//else statement for invalid width
                            System.out.println("invalid width");//ask again for another width statement
                            System.out.print("Enter the width: ");
                            scanner.next();//scan next width input
                        }//end of else statement
                    }//end of if statemment
                    else{//else statement for invalid length
                        System.out.println("invalid length");//ask again for another length statement
                        System.out.print("Enter the length: ");
                        scannner.next();//scan next length input
                    }//end of else statement
                    
                }//end of second while loop
                
            }//end of if statement
           
        
            if (choice.equals(triang)){//set if statement for if "triangle" is entered.
            //triangle algorith below follows the same functions as the rectangle in terms of getting correct input values.
                
                
                
                System.out.print("Enter base: ");
                
                while (!acceptable){
                    
                    if (scanner.hasNextDouble){
                
                        int base = scanner.nextInt();
                        System.out.print("Enter height: ");
                        
                        if (scanner.hasNextDouble){
                
                            int height = scanner.nextInt();
                            double areaOfTriangle = area(base, height);//uses area method below for triangle to find area given input
                            System.out.println("Area = " + areaOfTriangle);
                            acceptable=true;
                        }
                        else{
                            System.out.println("invalid height");
                            System.out.print("Enter the height: ");
                            scanner.next();
                        }
                    }
                    else{
                        System.out.println("invalid base");
                        System.out.print("Enter the base: ");
                        scanner.next();
                    }
                    
                }
                
                    
            }
            
            
            if (choice.equals(circ)){
            //circle algorithm below follows the same functions as the rectangle/triangle in terms of getting correct input values
            //except only one input value is needed which is the circle's radius
               
               
                System.out.print("Enter radius: ");
                
                while (!acceptable){
                    if (scanner.hasNextDouble){
                        
                        int radius = scanner.nextInt();
                        double areaOfCircle = area(radius);
                        System.out.println("Area = " + areaOfCircle);
                        acceptable=true;
                    }
                    else{
                        System.out.println("invalid radius");
                        System.out.print("Enter the radius: ");
                        scanner.next();
                    }
                }
                
                
            }
            else{
            System.out.println("Invalid choice you can choose rectangle circle or triangle");
            choice = scanner.nextLine();
            }
        }//end of first while loop
        
    }//end of main method
    
    
    //below is method overiding for area calculation for each shape
 
    public static double area(int radius) {//method for area of circle which is identified by only needing one int input 
        double area = Math.PI * radius * radius;//formula for calculation of area of circle
        return area;//method returns area calculated to where area method was last called
    }//end of method
 
    public static double area(int base, int height) {//method for area of triangle which is identified by needing two int statements
        double area = base*height*.5;//formula for calculation of area of circle which calculates it as a double
        return area;//method returns area calculated to where area method was last called
    }//end of method
 
    public static double area(double length, double width) {//method for area of rectangle which is identified by needing two double statements
        double area = length * width;//formula for calculation of area of rectangle which calculates it as a double
        return area;//method returns area calculated to where area method was last called
    }//end of method
 
}//end of class