/////////////////////////////////////////////////////////////////////////////////////////////////
//Jacob Jurecki
//lab02
//Cyclometer Lab
//09/04/2015
//
//Coding a bicycle cyclometer (meant to measure speed, distance, etc.)
//records two kinds of data including the time elapsed in seconds, and
//the number of rotations of the front wheel during that time.
//Program should print a) the number of minutes for each trip, b) print the 
//number of counts for each trip, c) print the distance of each trip in miles
//d)print the distance for the two trips combined
//
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args)  {
        //our input data. Document your variables by placing your
        //comments after the "//". State the purpose of each variable.
        
        int secsTrip1=480;  //number of seconds of Trip1
        int secsTrip2=3220; //number of seconds of Trip2
        int countsTrip1=1561;   //number of counts of Trip1
        int countsTrip2=9037;   //number of counts of Trip2
        
        //our intermediate variables and output data. Document!
        
        double wheelDiameter=27.0,  //setting wheel diameter quantity and type
        PI=3.14159, //setting PI value for calculations
        feetPerMile=5280,   //setting feet per mile value for calculations
        inchesPerFoot=12,   //setting inches per foot value for calculations
        secondsPerMinute=60;    //setting seconds per minute value for calculations
        double distanceTrip1, distanceTrip2, totalDistance; //establishing that 
        //each of these values is a double
        
        System.out.println("Trip 1 took" +
            (secsTrip1/secondsPerMinute)+" minutes and had"+
             countsTrip1+" counts.");
        System.out.println("Trip 2 took " +
            (secsTrip2/secondsPerMinute)+" minutes and had "+
             countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your
        //calculations here. What are you calculating
        //in these next few steps we are calculating the distance of both
        //trip 1 and trip 2 in inches then converting those values into miles.
        //
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheels travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
    //
    //
    //
    //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    
        
    }   //end of main method
}   //end of class
