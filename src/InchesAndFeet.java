import java.util.Scanner;

public class InchesAndFeet {
    public static void main(String[] args){

        int feet = 12;
        int userInput;

        Scanner input = new Scanner( System.in );
        System.out.println( "Enter number of inches" );

        userInput = input.nextInt();

        System.out.println( "Number of feet: " + (userInput / feet) +  "   Number of inches: " + (userInput % feet) );
    }
}
