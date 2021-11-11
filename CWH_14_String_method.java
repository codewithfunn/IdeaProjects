package com.company;

import java.util.Locale;

public class CWH_14_String_method {
    public static void main(String[] args){
//        some commonly used String methods are :-
        String name = "Harry";
        System.out.println("Your name is : "+name);
        int value = name.length();
        System.out.println("The length of String name is : " + value);
        String lString = name.toLowerCase(Locale.ROOT);
        System.out.println("toLowerCase return a string which has all character in lowerCase lString : "+lString);
        String uString = name.toUpperCase(Locale.ROOT);
        System.out.println("toUpperCase return a string which has all character in upperCase uString : " + uString);
        String nonTrimmedString = "      Harry       ";
        System.out.println("nonTrimmedString is : "+nonTrimmedString);
        System.out.println("trim return a new String after removing all the leading and trailing spaces from the original String ");
        System.out.println("trimmed String is :: "+ nonTrimmedString.trim());
        System.out.println("subString(int start) return a substring from start to the end :: subString(3) return : "+ name.substring(3));
        System.out.println("subString(int start , int end) return a subString from start index to the end index. Start index is in"+ name.substring(2,4));
        System.out.println("replace('r' , 'p') Return a new string after replacing r with p . Happy is returned in this case :: "+ name.replace('r','p'));
        // replace('r','p') it will replace char by char
        System.out.println("replace(''rry'' ,''irs'') Return a new string after replacing rry with irs . Hairs  is returned in this case :: "+ name.replace("rry", "irs"));
        System.out.println("startsWith('Ha') return true if name start with String 'Ha' true in this case :: " + name.startsWith("Ha"));
        System.out.println("endsWith('ry') return true if name ends with String 'ry' . true in this case :: "+ name.endsWith("ry"));
        System.out.println("charAt(2) return character at a given index position In this case it will return :: "+name.charAt(2));
        System.out.println("indexOf(s) return the index of the given String For example name.indexOf('ar') return 1 which is \n the first occurrence of ar in String 'Harry' , -1 otherwise In this case it return ::"+name.indexOf("a"));
        System.out.println("indexOf('s' , 3 ) return the index of the given String Starting from the index 3(int) . -1 is returned in this case :: "+name.indexOf('s',3));
        System.out.println("lastIndexOf('r') return the last index of the given string . It will return 3 in this case :: "+ name.lastIndexOf('r'));
        System.out.println("lastIndexOf('r',2) return the last index of the given string before index 2. and it will return :: " + name.lastIndexOf('r',2));
        System.out.println("equals('Harry') return true if the given String is equal to 'Harry' false otherwise [case sensitive] :: "+name.equals("Harry"));
        System.out.println("equalsIgnoreCase('harry') return true if two String are equal Ignoring the Case of Characters . In this case it will return :: "+ name.equalsIgnoreCase("harry"));
//       Escape Sequence character
//        sequence of character after backslash '\'
//        Escape Sequence Character consists of more than one character but represents one character when used within the string
//        example : \n -> newline , \t -> Tab , \' -> single quote , \\ -> backslash
        System.out.println(" I am escape sequence \" double quote");


    }


}

