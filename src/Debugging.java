import javax.swing.*;

public class Debugging {
    public static void main(String[] args)
    {
        int oneInt = 315;
        double oneDouble = 12.4;
        char oneChar = 'A';
        System.out.println("The int is ");
        System.out.println(oneInt);
        System.out.println("The double is ");
        System.out.println(oneDouble);
        System.out.println("The char is ");
        System.out.println(oneChar);
    }

    public static void debugging2(){
        int a, b;
        a = 7;
        b = 4;
        System.out.println("The sum is " + (a + b));
        System.out.println("The difference is " + (a - b));
        System.out.println("The product is " + (a * b));
    }

    public static void debugging3(){
        int a = 99, b = 8, result;
        long c = 7777777777777L;
        result = a % b;
        System.out.println("Divide " + a + " by " + b);
        System.out.println("remainder is " + result);
        System.out.println("c is a very large number: ");
        System.out.println(c);

    }

    public static void debugging4(){
        String costString;
        double cost;
        final double TAX = 0.06;
        costString = JOptionPane.showInputDialog(null,
                "Enter price of item you are buying", "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        cost = Double.parseDouble(costString);
        JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
                "% tax,  purchase  is $" + (cost + cost * TAX));

    }
}
