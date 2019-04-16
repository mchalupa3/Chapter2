import java.util.Scanner;

public class RemainderPractice {
    public static void main(String[] args){
        final double NUMKMINNAUTICAL = 1.852;
        final double NUMMILEINNAUTICAL= 1.150779;

        int userInput;

        Scanner input = new Scanner( System.in );
        System.out.println( "Enter number of nautical miles:  " );
        userInput = input.nextInt();
        System.out.println( "Number of Miles: " + (userInput / NUMMILEINNAUTICAL) + "Number of Kilometers: " + (userInput / NUMKMINNAUTICAL));


    }


}
