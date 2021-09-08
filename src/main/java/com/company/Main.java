package com.company;

import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String age_string= scan.nextLine();
        int age = Integer.parseInt(age_string);
        System.out.print("At what age would you like to retire? ");
        String retire_string= scan.nextLine();
        int retirement = Integer.parseInt(retire_string);
        int time_left = retirement-age;
        System.out.println("You have "+time_left+" years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int year_retire=year+time_left;
        System.out.println("It's "+ year+ ", so you can retire in "+ year_retire);
        // write your code here
    }
}
