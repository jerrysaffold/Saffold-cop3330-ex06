package base.ex06;
/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Jerry Saffold
 */

import java.time.Year;
import java.util.Scanner;

/*Exercise 6 - Retirement Calculator
Your computer knows what the current year is, which means you can incorporate that into your programs.
You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire.
It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.*/
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String age = input.nextLine();
        System.out.print("At what age would you like to retire? ");
        String rage = input.nextLine();

        int number_age = Integer.parseInt(age);
        int number_retire = Integer.parseInt(rage);

        int years_until_retire = number_retire - number_age;
        int thisYear = Year.now().getValue();
        int retirement_year = thisYear + years_until_retire;

        System.out.printf("You have %d years left until you can retire.\nIt's %d, you can retire in %d.", years_until_retire,
                thisYear, retirement_year);
    }
}
