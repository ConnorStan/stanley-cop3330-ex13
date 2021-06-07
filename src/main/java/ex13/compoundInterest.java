/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex13;

import java.util.Scanner;
import java.lang.Math;

public class compoundInterest {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("Enter the principle. ");
        String principleAmount = in.nextLine();
        System.out.print("Enter the rate of interest. ");
        String interestRate = in.nextLine();
        System.out.print("Enter the number of years. ");
        String numberYears = in.nextLine();
        System.out.print("What is the number of times the interest is compounded per year?");
        String compoundRate = in.nextLine();


        // Numerical Conversion from string to type double and int to allow for decimals as well as whole numbers
        double principle = Double.parseDouble(principleAmount);
        double interest = Double.parseDouble(interestRate)/100;
        int years = Integer.parseInt(numberYears);
        double compound = Double.parseDouble(compoundRate);

        // Compound Interest formula broken into three sections
        double sectionOneCalculation = 1 + interest / compound;
        double sectionTwoCalculation = compound * years;
        double sectionThreeCalculation = Math.pow(sectionOneCalculation, sectionTwoCalculation);

        // Final Calculation and decimal conversion to the hundredths
        double preciseInvestmentWorth = principle * sectionThreeCalculation;
        double finalInvestmentWorth = Math.floor(preciseInvestmentWorth*100)/100;


        // Output in a single line.
        System.out.print("$" + principle + "dollars invested at "+ interest * 100 + "% for "+ years + " years compounded " + compound + " times per year is $" + finalInvestmentWorth + ".");

    }

}


