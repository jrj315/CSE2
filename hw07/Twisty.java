/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw07
//Twisty!
//
//
import java.util.Scanner;//imports the scanner of course
//
public class Twisty {
    //main method required for every Java program
    public static void main(String[] args)  {
        
        Scanner scan=new Scanner(System.in);//set scanner
        int length = 0;//set initial values for length
        int width = 0;//and width
        
        
        boolean acceptable = false;//set boolean value for infinity loop
        
        System.out.println("Enther the length: ");//request length value
        while (!acceptable){//starting firt infinity loop
            if (scan.hasNextInt()){//setting if statement with else at very bottom to
                length = scan.nextInt();//see if its the correct input value
                //^^^^ setting length to be next scan if correct
                
                System.out.println("Enter the width: ");//requesting width at 
                                                        //correct length
                while (!acceptable){//starting second infinity loop for correct width input
                    if (scan.hasNextInt()&&scan.nextInt()<length){//setting parameters for correct
                                                                //width input
                     
                        width=scan.nextInt();//if correct then width is set to be the scan value
                        acceptable = true;//setting end acceptable value if true (this line might be not needed)
                        //////////////////////////////////////////////////////
                        //next starting place here
                        //make length loop first to know
                        //how many chars are being used
                        //then width to know when they change
                        //direction //length of chars and spaces together coss map
                        //width-2 -> -4 -> -6 based upon location=spaces between each # and /
                        
                       
                        //for (int i=1; i<width; i++){
                            //for (int j=1; j<i+1; j++){
                                //System.out.println(" ");
                            //}
                            
                            //System.out.println("#");
                            
                            
                            
                        //}
                        //for (int j=0 ; j==length; j++){
                            //for( int i=0; i==1 ; i++){
                                //System.out.println("#");
                                
                            //}
                //            //for(int i=1 ; i==6 ; i++){
                  //              System.out.println(" ");
                    //           
                      //      }
                          //  for(int i=6 ; i==width ; i++){
                        //        System.out.println("^");
                      //          
                        //    }
                          //  for (int i=width ; i==7 ; i++){
                           //     System.out.println( "^" );
                                
                            // }
                        //    for (int i=7 ; i==13 ; i++){    
                          //      System.out.println(" ");
                                
                        //    }   
                         //   for (int i=13 ; i==14 ; i++){
                           //     System.out.println("#");
                                
                           // }
                            //do{
                                
                               //int i=i-14;
                                
                            //}while (i==14);
                            
                        
                       // }
                        //do{
                            //int j=j-length;
                            //int i=i+1;
                            //width=width-2;
                            //System.out.println("\n");
                        //}while (j==length);
                        
                        
                        
                        ////////////////////////////////////////////
                    }//end of if statement in second while loop
                   
                    else{//else statement for if invalid width input that triggers 
                        System.out.println("invalid");//another prompt/input as shown
                        System.out.print("Enter the width: ");
                        scan.next();
                    }//end of else statement in second while loop
                }//end of second while loop
            
                    
            }//end of first if statement
            
                  
                    
            else{//else statement for if invalid length input that triggers
                System.out.println("invalid");//another prompt/input as shown
                System.out.print("Enter the length: ");
                scan.next();
            }//end of else statement in first while loop
        }//end of first while loop
    
        
    }//end of class and main method between these two bottom brackets
}

//Final Note (as my code is clearly incomplete):
//
//I could get the program to let me know if my inputs were acceptable.
//Sometimes when I ran it through since its such a heavy load
//on an internet site it would stall. However, i believe my coding for the check
//without being able to use try and catch is on point. I couldn't find anything
//on the internet or in the book about printing a pattern like this.
//
//
//
//
//
//
