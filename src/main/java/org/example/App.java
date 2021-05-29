/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 13 - Determining Compound Interest
 */

package org.example;

// Import necessary libraries
import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Prompt user for input of the principal, rate, # of years, and times
        // compounded per year and store in their respective data types
        System.out.println("What is the principal amount?");
        Scanner principalIn = new Scanner(System.in);
        int principal = principalIn.nextInt();

        System.out.println("What is the rate?");
        Scanner rateIn = new Scanner(System.in);
        double rate = rateIn.nextDouble();

        System.out.println("What is the number of years?");
        Scanner yearsIn = new Scanner(System.in);
        int years = yearsIn.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        Scanner compoundIn = new Scanner(System.in);
        int compound = compoundIn.nextInt();

        // Limit any variable called using df.format() to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // Divide rate by 100, then calculate using the formula for compounded interest
        double actualRate = rate / 100;
        double total = principal * (Math.pow((1 + (actualRate / compound)), (compound * years)));

        // Print exit statement using string concatenation since I don't like interpolation, sue me
        System.out.println("$" + principal + " invested at " + rate + "% for " +
                            years + " years compounded " + compound + " times per year is $"
                            + df.format(total) + ".");
    }
}
