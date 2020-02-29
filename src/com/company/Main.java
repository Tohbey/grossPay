package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double hours;
        double rate;

        payRoll employee = new payRoll();

        System.out.print("how many hours did the employee work? ");
        hours = input.nextDouble();

        System.out.print("what is the employee pay rate? ");
        rate = input.nextDouble();

        employee.setHoursworked(hours);
        employee.setPayRate(rate);

        System.out.println("the employee's gross pay is $" +employee.getGross());
    }
}
