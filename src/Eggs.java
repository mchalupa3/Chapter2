import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        double singleEgg = .45;
        double dozen = 3.25;
        int userInput;



        Scanner input = new Scanner( System.in );
        System.out.println( "Enter the number of eggs you would like to order.>>>" );

        userInput = input.nextInt();

        double totalPrice;
        totalPrice = (userInput / 12 * dozen ) + (userInput % 12 * singleEgg);
        System.out.println( "You wanted " + userInput + " eggs. This is " + (userInput /12 ) + " dozen and " + (userInput % 12 )+
                " single eggs for a total of  " + totalPrice + " Dollars");

    }
}
