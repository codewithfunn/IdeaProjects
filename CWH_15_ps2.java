package com.company;

import java.util.Locale;

public class CWH_15_ps2 {
    public static void main(String[] args){
//        write a program to convert a string to lowerCase
        String name = "Jaspreet Singh";
        name = name.toLowerCase(Locale.ROOT);
        System.out.println("I convert name into lowerCase it will return this :: " +name);
//        write a java program to replace spaces with underscore
        String text = "To Lower Case";
        text = text.replace(' ', '_');
        System.out.println("It will replace TO Lower Case into this :: "+text);
//        write a java program to fill in a letter template which looks like below :
//        letter  = "Dear <|name|> , thanks a lot"
//        Replace <|name|> with a String (some name)
        String letter = "Dear <|name|> , Thanks a lot";
        letter = letter.replace("<|name|>","jaspreet");
        System.out.println("Greeting :: "+letter);
//        write a java program to detect double and triple spaces in a String
        String myString = "This string contains double and triple    spaces";
        int double_space = myString.indexOf("  ");
        int triple_space = myString.indexOf("   ");
        System.out.println("This String has double space at the index of "+double_space + " and triple space at the index of "+triple_space + " .If it return -1 it means not founded in a given string ");
    // write a program to format the following letter using escape sequence character
        String myLetter = "Dear Japreet Singh,\n\t This Java Course is nice.\n\t Thanks";
        System.out.println(myLetter);


    }
}
