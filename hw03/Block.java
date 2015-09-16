/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//hw03
//Scanner Java Programs
//Program 2
//
import java.util.Scanner;
public class Block{

//  add main method
    public static void main(String[] args)  {
        
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the length of the block: ");
        double blockLength = myScanner.nextDouble();
        //Setting the scanner for the block length as a double
        System.out.print("Enter the width of the block: ");
        double blockWidth = myScanner.nextDouble();
        //Setting the scanner for the block width as a double
        System.out.print("Enter the Height of the block: ");
        double blockHeight = myScanner.nextDouble();
        //Setting the scanner for the block heighth as a double
        double blockVolume;
        double blockArea;
        //establishing the block volume and surface area as doubles
        blockVolume=blockLength*blockWidth*blockHeight;
        //calculating for block volume
        blockArea=2*blockLength*blockWidth+2*blockWidth*blockHeight+2*blockLength*blockHeight;
        //calculating for block surface area
        System.out.println("The volume of the block dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume+".");
        //printing the calculated volume of the block given the scanned dimensions
        System.out.println("The surface area of the block is "+blockArea+".");
        //printing the block surface area given the scanned dimensions
    }//end of main method
}//end of class
