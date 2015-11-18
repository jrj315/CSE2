/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw12
//Transpose
//11/17/2015
//
//
//note to grader: Only issue I came accross in this homework was in my dual while loop to make sure that input was correct
//               and if it wasn't to ask again for another input. My program will ask you to enter in the input twice
//               instead of just once. The first time you enter the number the program will check if it is an integer
//               the second time if the number is greater than zero. The reason for this is that ".hasNextInt" will not 
//               check for if >0 as it is it's own boolean expression (.hasNextInt>0 will not make sense and ".scanNextInt>0" 
//               only checks if >0 while both expressions require their own separate input.

import java.util.Random;//import needed util's
import java.util.Scanner;
import java.lang.Math;

public class Transpose{//main method
    public static void main(String[] args) {
        int height = 0;//set initial values for height
        int width = 0;//and width
        
        Scanner scan=new Scanner(System.in);
        
        
        boolean acceptable = false;//set boolean value for infinity loop
        
        System.out.println("Enter the height: ");//request height value
        while (!acceptable){//starting first infinity loop
            
            if (scan.hasNextInt()&&scan.nextInt()>0){//setting if statement with else at very bottom to
                height = scan.nextInt();//set height equal to the input height
                //see if its the correct input value
                
                
                System.out.println("Enter the width: ");//requesting width at 
                                                        //correct length
                while (!acceptable){//starting second infinity loop for correct width input
                    
                    if (scan.hasNextInt()&&scan.nextInt()>0){//setting parameters for correct
                                                                //width input
                     
                        width=scan.nextInt();//if correct then width is set to be the scan value
                        
                        acceptable = true;//setting end acceptable value if true 
                        int m = height;//set height and width to be single letter variables
                        int n = width;//to make things easier
                        int[][] matrixRR=new int[n][m];//intitialize arrays for the random matrix "matrixRR"
                        int[][] matrixTT=new int[n][m];//and the transpose of the random matrix "matrixTT"
                        matrixRR = randomMatrix(m,n);//set matrixRR equal to the return value of randomMatrix()method enacted upon m and n values
                        System.out.println("random matrix:");//print description of what is printed below for user.
                        printMatrix(matrixRR);//use printMatrix() method to print the matrixRR value
                        matrixTT = transposeMatrix(matrixRR);//use transposeMatrix() to return the transpose matrix given the inputed matrixRR
                        System.out.println("random transpose matrix:");//print description of what is printed below for user
                        printMatrix(matrixTT);//print he matrixTT value
                    }//end of if statement in second while loop
                   
                    else{//else statement for if invalid width input that triggers 
                        System.out.println("invalid");//another prompt/input as shown
                        System.out.println("Enter the width: ");
                        scan.next();
                    }//end of else statement in second while loop
                }//end of second while loop
            
                    
            }//end of first if statement
            
                  
                    
            else{//else statement for if invalid length input that triggers
                System.out.println("invalid");//another prompt/input as shown
                System.out.println("Enter the height: ");
                scan.next();
            }//end of else statement in first while loop
        }//end of first while loop
    
    }//end of main method
        
    
    
    public static int[][] randomMatrix(int n, int m){//method that returns a matrix given its n width and m height input
        Random random = new Random();//set variable for random generated value
        int[][] matrixR=new int[n][m];//initialize matrixR as a 2D array of n and m input
        for (int i=0;i<matrixR.length;i++){//set dual for loop to give a random value between -10 and 10 for each posistion within
            for (int j=0;j<matrixR[i].length;j++){//the m and n parameters of the random matrix.
                matrixR[i][j]= random.nextInt(10+1+10)-10;
                
            }//end loop1
        }//end loop2
        return matrixR;//returns matrixR value to main method         
    }//end randomMatrix method
    
    public static int[][] transposeMatrix(int[][] array){//method that returns the transpose of the input matrix array
        int c = array.length;//set c equal to the width of the input matrix array
        int d = array[0].length;//set d equal to the height of the input matrix array
        int[][] matrixT=new int[d][c];//set matrixT equal to the swap of the input array's width and heighth dimensions
        for (int i=0;i<array.length;i++){//dual for loop to swap the numerical values along with the dimensions
            for (int j=0;j<array[i].length;j++){
                matrixT[j][i]=array[i][j];//set matrixT i and j values to be the swap of the inputed array.
            } //end loop1           
        }//end loop 2
        return matrixT;//returns matrixT value to main method
    }//end transposeMatrix method
    
    public static void printMatrix(int[][] array){//method that prints the inputed array into matrix form
        
        for (int i=0;i<array.length;i++){//set dual for loop to print each value in the array based upon 
            for (int j=0;j<array[i].length;j++){//it's height and width 
                
                System.out.print(array[i][j]+" ");//prints each array value on the same line separated by a space   
            }//end loop1
        System.out.println();//starts each new line after width parameters are met
        }//end loop2
    }//end printMatrix method

    
}//end of class