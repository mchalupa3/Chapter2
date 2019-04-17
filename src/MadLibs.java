import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class MadLibs {
    public static void main(String[] args){

        String color, wordEST, bodyPartPlural, animal, noun, pluralNoun;
        int a, b, c;
        String aString, bString;

        color = JOptionPane.showInputDialog( null,
                "Enter a Color", JOptionPane.INFORMATION_MESSAGE );

        wordEST = JOptionPane.showInputDialog( null,
                "Enter a word ending in EST ", JOptionPane.INFORMATION_MESSAGE );

        bodyPartPlural= JOptionPane.showInputDialog( null,
                "Enter a Plural body part", JOptionPane.INFORMATION_MESSAGE );

        animal = JOptionPane.showInputDialog( null,
                "Enter an animal", JOptionPane.INFORMATION_MESSAGE );

        noun = JOptionPane.showInputDialog( null,
                "Enter a Noun", JOptionPane.INFORMATION_MESSAGE );

        pluralNoun = JOptionPane.showInputDialog( null,
                "Enter a plural Noun", JOptionPane.INFORMATION_MESSAGE );

        aString =JOptionPane.showInputDialog( null,
                "Enter a Number", JOptionPane.INFORMATION_MESSAGE );

        a = Integer.parseInt( aString );

        bString = JOptionPane.showInputDialog( null,
                "Enter a Another Number", JOptionPane.INFORMATION_MESSAGE );

        b = Integer.parseInt( bString );

        c = a + b;

        JOptionPane.showMessageDialog( null, "The " + color + " Dragon is the " + wordEST + " Dragon of all! It has \n "
        +  c +" "+ bodyPartPlural + " , and a " + animal + " Shaped like a " + noun + ". It loves to eat " + pluralNoun + ", although it \n" +
                "will feat nearly on anything. ");






    }
}
