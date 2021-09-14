package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 3 - Printing Quotes");
        System.out.print("What is quote? ");
        Scanner in = new Scanner(System.in);
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String auther = in.nextLine();
        System.out.println(auther + " says, " + "\"" + quote+"\""  );
    }
}
