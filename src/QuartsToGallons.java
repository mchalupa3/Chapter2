import java.util.Scanner;

public class QuartsToGallons {
    public static void main(String[] args){
        int numOfquarts;
        int numOfQuartsInGallon = 4;
        int remdainderofQuarts;
        int numOfGallons;

        Scanner keyboard = new Scanner( System.in );

        System.out.println( "Please Enter the number of quarts needed to do the job>>>>>>>" );

        numOfquarts = keyboard.nextInt();

        numOfGallons = numOfquarts / numOfQuartsInGallon;

        remdainderofQuarts = numOfquarts % numOfQuartsInGallon;
        System.out.println( "The number of gallons ordered is: " + numOfGallons + " And the number of quarts remaining is " + remdainderofQuarts );


    }
}
